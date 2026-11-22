
	// UrlInspector

	public class UrlInspector{

		private String URL;
		private String hostname;
		private String path;

		public UrlInspector(String url){
			this.URL = url;
		}


		public boolean isUrlValid(String url){
			if(url.isEmpty() && (url.startsWith("http://") || url.startsWith("https://")) && url.substring(url.indexOf("://") + 3).isEmpty() && url.substring(url.indexOf("://") + 3).contains(".") ){
				return true;
			}
			return false;
		} // isUrlValid

		public String extractHostname(String url){
			
			if(isUrlValid(url)){
				
				int protocolEnd = url.indexOf("://");
				int pathStart = url.indexOf("/", protocolEnd + 3);
				if(pathStart == -1){
					return url.substring(protocolEnd + 3);
				}else {
					return url.substring(protocolEnd + 3, pathStart);
				}
				
			}

			return null;
		
		} // extractHostname


		public String extractPath(String url){
			if(isUrlValid(url)){

				int startIndex = url.indexOf("/");
				return url.substring(startIndex);
			
			}	
			return null;
		} // extractPath


	} // class
