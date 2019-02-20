import java.io.*;

public class SSHfile
{
    public void runShellShript() throws IOException
	{
        try
		{
            String myKey="F:/pem file.keyRSA.pem";
            Runtime runtime = Runtime.getRuntime();
            String commande = "ssh -i "+myKey+" ubuntu@52.89.24.41"+" /path/shellScripFile.sh";
            Process p = runtime.exec(commande);
            BufferedReader reader = new BufferedReader(new InputStreamReader(p.getErrorStream()));
            String line = reader.readLine();
			
            while (line != null) 
			{
            System.out.println(line);
            line = reader.readLine();
            }
            p.waitFor();
        }
		catch(Exception e)
		{
            e.printStackTrace();
        }       
    }
	public static void main(String ...rr) throws IOException
	{
		SSHfile sf = new SSHfile();
		 
	}
 }