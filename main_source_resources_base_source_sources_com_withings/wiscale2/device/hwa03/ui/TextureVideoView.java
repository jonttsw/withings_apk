package com.withings.wiscale2.device.hwa03.ui;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.media.MediaPlayer;
import android.util.AttributeSet;
import android.view.Surface;
import android.view.TextureView;
/* loaded from: classes5.dex */
public class TextureVideoView extends TextureView implements TextureView.SurfaceTextureListener {

    /* renamed from: a  reason: collision with root package name */
    private MediaPlayer f54232a;

    /* loaded from: classes5.dex */
    public interface a {
    }

    /* loaded from: classes5.dex */
    public interface b {
    }

    /* loaded from: classes5.dex */
    public interface c {
    }

    /* loaded from: classes5.dex */
    public interface d {
    }

    public TextureVideoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        MediaPlayer mediaPlayer = this.f54232a;
        if (mediaPlayer == null) {
            this.f54232a = new MediaPlayer();
        } else {
            mediaPlayer.reset();
        }
        setSurfaceTextureListener(this);
    }

    public int getDuration() {
        return this.f54232a.getDuration();
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i11, int i12) {
        this.f54232a.setSurface(new Surface(surfaceTexture));
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    public TextureVideoView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        MediaPlayer mediaPlayer = this.f54232a;
        if (mediaPlayer == null) {
            this.f54232a = new MediaPlayer();
        } else {
            mediaPlayer.reset();
        }
        setSurfaceTextureListener(this);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    public void setOnErrorListener(a aVar) {
    }

    public void setOnVideoCompletedListener(b bVar) {
    }

    public void setOnVideoPreparedListener(c cVar) {
    }

    public void setOnViewAvailableListener(d dVar) {
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i11, int i12) {
    }
}
