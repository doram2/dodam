package springBootTest2.service.emplib;

import java.io.File;
import java.io.FileInputStream;
import java.net.URLEncoder;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.util.FileCopyUtils;
@Component
@Service
public class FileDownService {
	public void execute(String sfile, String ofile, HttpServletRequest request, HttpServletResponse response) {
		String filePath = "/view/emplib";
		String fileDir = request.getServletContext().getRealPath(filePath);
		String originalFileName = null;
		try {
			originalFileName = URLEncoder.encode(ofile,"utf-8");
		} catch (Exception e) {
			e.printStackTrace();
		}
		//						"text/html"
		response.setContentType("application/octet-stream; charset=UTF-8");
		response.setHeader("Content-Disposition", "attachment;filename="+originalFileName);
		response.setHeader("Content-Transfer-Encoding", "binary");
		File file = new File(fileDir + "/" + sfile);
		ServletOutputStream out1 = null;
		FileInputStream fis = null;
		try {
			out1 = response.getOutputStream();
			fis = new FileInputStream(file);
			FileCopyUtils.copy(fis, out1);
			response.flushBuffer();
			out1.flush();
			out1.close();
		} catch (Exception e) {e.printStackTrace();}
		finally{
			if(fis!=null) {
				try {
					fis.close();
				} catch (Exception e) {
					
				}
			}
		}
	}
}
