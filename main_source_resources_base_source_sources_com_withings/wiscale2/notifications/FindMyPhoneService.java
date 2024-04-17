package com.withings.wiscale2.notifications;

import android.app.Service;
import android.content.Intent;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.IBinder;
import com.withings.wiscale2.C1987R;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import u70.a;
/* compiled from: FindMyPhoneService.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/withings/wiscale2/notifications/FindMyPhoneService;", "Landroid/app/Service;", "Lu70/a$c;", "<init>", "()V", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class FindMyPhoneService extends Service implements a.c {

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ int f58765b = 0;

    /* renamed from: a  reason: collision with root package name */
    private MediaPlayer f58766a;

    @Override // u70.a.c
    public final long H() {
        return 0L;
    }

    @Override // u70.a.c
    public final void f2(long j5) {
        MediaPlayer mediaPlayer = this.f58766a;
        if (mediaPlayer != null) {
            mediaPlayer.stop();
        }
        stopSelf();
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public final void onDestroy() {
        a.b().h(this);
        super.onDestroy();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i11, int i12) {
        Bundle extras;
        a.b().a(this);
        if (intent != null && (extras = intent.getExtras()) != null && extras.getBoolean("extra_should_stop")) {
            MediaPlayer mediaPlayer = this.f58766a;
            if (mediaPlayer != null) {
                mediaPlayer.stop();
            }
            stopSelf();
        } else {
            Object systemService = getApplicationContext().getSystemService("audio");
            u.h(systemService, "null cannot be cast to non-null type android.media.AudioManager");
            AudioManager audioManager = (AudioManager) systemService;
            audioManager.setStreamVolume(3, audioManager.getStreamMaxVolume(3), 0);
            MediaPlayer create = MediaPlayer.create(this, (int) C1987R.raw.ring);
            this.f58766a = create;
            if (create != null) {
                create.setLooping(true);
            }
            MediaPlayer mediaPlayer2 = this.f58766a;
            if (mediaPlayer2 != null) {
                mediaPlayer2.start();
            }
        }
        return super.onStartCommand(intent, i11, i12);
    }

    @Override // u70.a.c
    public final void Q2() {
    }
}
