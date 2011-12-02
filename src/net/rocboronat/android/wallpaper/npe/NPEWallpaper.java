package net.rocboronat.android.wallpaper.npe;

import android.service.wallpaper.WallpaperService;
import android.view.SurfaceHolder;

public class NPEWallpaper extends WallpaperService {

    @Override
    public Engine onCreateEngine() {
        return new NPEEngine();
    }

    class NPEEngine extends Engine {
		NPEEngine(){
//			Log.i("EOIN", "Engine created");
		}
		
		@Override
        public void onSurfaceChanged(SurfaceHolder holder, int format, int width, int height) {
            super.onSurfaceChanged(holder, format, width, height);
			getSurfaceHolder().unlockCanvasAndPost(getSurfaceHolder().lockCanvas());
        }

        @Override
        public void onOffsetsChanged(float xOffset, float yOffset, float xStep, float yStep, int xPixels, int yPixels) {
        	super.onOffsetsChanged(xOffset, yOffset, xStep, yStep, xPixels, yPixels);
			getSurfaceHolder().unlockCanvasAndPost(getSurfaceHolder().lockCanvas());
        }
    }
}
