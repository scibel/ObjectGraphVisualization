package ch.hsr.ogv.util;

import java.net.URL;

/**
 * 
 * @author Simon Gwerder
 *
 */
public class ResourceLocator {
	
	public static URL getResourcePath(Resource res) {
		return ResourceLocator.class.getClassLoader().getResource(res.getRelativePath());
	}
	
	public enum Resource {

		ICON_PNG("images/dummy_icon.png"),
		PANEPRESET_FXML("templates/PanePreset.fxml"),
		ROOTLAYOUT_FXML("templates/RootLayout.fxml"),
		LIGHTHEME_CSS("css/LightTheme.css"),
		DARKTHEME_CSS("css/DarkTheme.css"),
		TEXTFIELD_CSS("css/TextField.css"),
		OPEN_ARROW_OBJ("models/open_arrow.obj"),
		FILLED_ARROW_OBJ("models/filled_arrow.obj"),
		EMPTY_ARROW_OBJ("models/empty_arrow.obj");
		
		private String relativePath = "./";
		
		private Resource(String relativePath) {
			this.setRelativePath(relativePath);
		}
		
		public String getRelativePath() {
			return relativePath;
		}
		
		public void setRelativePath(String relativePath) {
			this.relativePath = relativePath;
		}
		
	}

}
