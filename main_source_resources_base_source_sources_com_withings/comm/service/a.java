package com.withings.comm.service;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import androidx.activity.f;
import com.withings.comm.service.WppDeviceService;
import nm0.y;
/* compiled from: WppDeviceServiceNotificationPoster.kt */
/* loaded from: classes3.dex */
public interface a {

    /* compiled from: WppDeviceServiceNotificationPoster.kt */
    /* renamed from: com.withings.comm.service.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static final class ServiceConnectionC0447a implements a, ServiceConnection {

        /* renamed from: a  reason: collision with root package name */
        private final ym0.a<y> f33163a;

        /* renamed from: b  reason: collision with root package name */
        private a f33164b;

        public ServiceConnectionC0447a(f fVar) {
            this.f33163a = fVar;
        }

        @Override // com.withings.comm.service.a
        public final boolean a() {
            a aVar = this.f33164b;
            if (aVar != null) {
                return aVar.a();
            }
            return false;
        }

        public final boolean b() {
            if (this.f33164b != null) {
                return true;
            }
            return false;
        }

        @Override // android.content.ServiceConnection
        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            WppDeviceService.b bVar;
            if (iBinder instanceof WppDeviceService.b) {
                bVar = (WppDeviceService.b) iBinder;
            } else {
                bVar = null;
            }
            if (bVar != null) {
                this.f33164b = bVar.a();
                this.f33163a.invoke();
            }
        }

        @Override // android.content.ServiceConnection
        public final void onServiceDisconnected(ComponentName componentName) {
            this.f33164b = null;
        }
    }

    /* compiled from: WppDeviceServiceNotificationPoster.kt */
    /* loaded from: classes3.dex */
    public static final class b implements a {

        /* renamed from: a  reason: collision with root package name */
        private boolean f33165a = false;

        @Override // com.withings.comm.service.a
        public final boolean a() {
            return this.f33165a;
        }

        public final void b(boolean z5) {
            this.f33165a = z5;
        }
    }

    boolean a();
}
