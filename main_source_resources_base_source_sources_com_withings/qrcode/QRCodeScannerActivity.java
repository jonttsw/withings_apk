package com.withings.qrcode;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.widget.Toast;
import androidx.activity.ComponentActivity;
import androidx.activity.result.e;
import androidx.camera.core.d0;
import androidx.camera.core.f1;
import androidx.camera.core.l;
import androidx.camera.core.r;
import androidx.camera.view.PreviewView;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.l0;
import androidx.compose.runtime.v0;
import com.google.common.util.concurrent.i;
import com.huawei.hms.push.AttributionReporter;
import com.withings.android.activity.WithingsActivity;
import com.withings.qrcode.QRCodeScannerActivity;
import com.withings.wiscale2.C1987R;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.Metadata;
import kotlin.collections.s0;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import nm0.g;
import nm0.h;
import nm0.j;
import nm0.y;
import u70.k;
import yk.o;
import ym0.p;
/* compiled from: QRCodeScannerActivity.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/withings/qrcode/QRCodeScannerActivity;", "Lcom/withings/android/activity/WithingsActivity;", "<init>", "()V", "qrcode_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class QRCodeScannerActivity extends WithingsActivity {

    /* renamed from: j  reason: collision with root package name */
    public static final /* synthetic */ int f43854j = 0;

    /* renamed from: c  reason: collision with root package name */
    private l f43857c;

    /* renamed from: e  reason: collision with root package name */
    private PreviewView f43859e;

    /* renamed from: g  reason: collision with root package name */
    private ParcelableSnapshotMutableState f43861g;

    /* renamed from: h  reason: collision with root package name */
    private final androidx.activity.result.b<String> f43862h;

    /* renamed from: i  reason: collision with root package name */
    private final androidx.activity.result.b<androidx.activity.result.e> f43863i;

    /* renamed from: a  reason: collision with root package name */
    private final g f43855a = h.b(new e());

    /* renamed from: b  reason: collision with root package name */
    private final g f43856b = h.b(f.f43868a);

    /* renamed from: d  reason: collision with root package name */
    private final g f43858d = h.b(new c());

    /* renamed from: f  reason: collision with root package name */
    private final j40.d f43860f = new j40.d(new b(this), new a(this));

    /* compiled from: QRCodeScannerActivity.kt */
    /* loaded from: classes4.dex */
    /* synthetic */ class a extends s implements ym0.l<h40.a, y> {
        a(Object obj) {
            super(1, obj, QRCodeScannerActivity.class, "onQRCodeResults", "onQRCodeResults(Lcom/withings/qrcode/models/WiFiCredential;)V", 0);
        }

        @Override // ym0.l
        public final y invoke(h40.a aVar) {
            h40.a p02 = aVar;
            u.j(p02, "p0");
            QRCodeScannerActivity qRCodeScannerActivity = (QRCodeScannerActivity) this.receiver;
            int i11 = QRCodeScannerActivity.f43854j;
            qRCodeScannerActivity.getClass();
            Intent intent = new Intent();
            intent.putExtra("qrcode_password", p02.a());
            intent.putExtra("qrcode_ssid", p02.b());
            qRCodeScannerActivity.setResult(-1, intent);
            qRCodeScannerActivity.finish();
            return y.f85009a;
        }
    }

    /* compiled from: QRCodeScannerActivity.kt */
    /* loaded from: classes4.dex */
    /* synthetic */ class b extends s implements ym0.a<y> {
        b(Object obj) {
            super(0, obj, QRCodeScannerActivity.class, "onQRCodeWrongType", "onQRCodeWrongType()V", 0);
        }

        @Override // ym0.a
        public final y invoke() {
            QRCodeScannerActivity qRCodeScannerActivity = (QRCodeScannerActivity) this.receiver;
            int i11 = QRCodeScannerActivity.f43854j;
            Toast.makeText(qRCodeScannerActivity, qRCodeScannerActivity.getString(C1987R.string.installation_device_wifi_setup_wrongqrcode_error), 1).show();
            int i12 = v70.a.f103433b;
            v70.a.d("failed_qr_code_analysis", "failed_qr_code_analysis", null, true);
            return y.f85009a;
        }
    }

    /* compiled from: QRCodeScannerActivity.kt */
    /* loaded from: classes4.dex */
    static final class c extends w implements ym0.a<Boolean> {
        c() {
            super(0);
        }

        @Override // ym0.a
        public final Boolean invoke() {
            l lVar = QRCodeScannerActivity.this.f43857c;
            if (lVar != null) {
                return Boolean.valueOf(lVar.b().f());
            }
            u.s("camera");
            throw null;
        }
    }

    /* compiled from: QRCodeScannerActivity.kt */
    /* loaded from: classes4.dex */
    static final class d extends w implements p<androidx.compose.runtime.a, Integer, y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f43865a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ QRCodeScannerActivity f43866b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(int i11, QRCodeScannerActivity qRCodeScannerActivity) {
            super(2);
            this.f43865a = i11;
            this.f43866b = qRCodeScannerActivity;
        }

        @Override // ym0.p
        public final y invoke(androidx.compose.runtime.a aVar, Integer num) {
            androidx.compose.runtime.a aVar2 = aVar;
            if ((num.intValue() & 11) == 2 && aVar2.h()) {
                aVar2.C();
            } else {
                o.b(false, s1.b.b(aVar2, -1622801570, new com.withings.qrcode.d(this.f43865a, this.f43866b)), aVar2, 48, 1);
            }
            return y.f85009a;
        }
    }

    /* compiled from: QRCodeScannerActivity.kt */
    /* loaded from: classes4.dex */
    static final class e extends w implements ym0.a<k> {
        e() {
            super(0);
        }

        @Override // ym0.a
        public final k invoke() {
            return new k(QRCodeScannerActivity.this);
        }
    }

    /* compiled from: QRCodeScannerActivity.kt */
    /* loaded from: classes4.dex */
    static final class f extends w implements ym0.a<String> {

        /* renamed from: a  reason: collision with root package name */
        public static final f f43868a = new w(0);

        @Override // ym0.a
        public final String invoke() {
            if (Build.VERSION.SDK_INT >= 33) {
                return "android.permission.READ_MEDIA_IMAGES";
            }
            return "android.permission.READ_EXTERNAL_STORAGE";
        }
    }

    public QRCodeScannerActivity() {
        ParcelableSnapshotMutableState f11;
        f11 = l0.f(Boolean.FALSE, v0.f8878a);
        this.f43861g = f11;
        androidx.activity.result.b<String> registerForActivityResult = registerForActivityResult(new g.a(), new g40.a(this, 0));
        u.i(registerForActivityResult, "registerForActivityResult(...)");
        this.f43862h = registerForActivityResult;
        androidx.activity.result.b<androidx.activity.result.e> registerForActivityResult2 = registerForActivityResult(new g.a(), new g40.b(this, 0));
        u.i(registerForActivityResult2, "registerForActivityResult(...)");
        this.f43863i = registerForActivityResult2;
    }

    public static void A3(i cameraProviderFuture, QRCodeScannerActivity this$0, Context context, ExecutorService executorService) {
        u.j(cameraProviderFuture, "$cameraProviderFuture");
        u.j(this$0, "this$0");
        u.j(context, "$context");
        V v11 = cameraProviderFuture.get();
        u.i(v11, "get(...)");
        androidx.camera.lifecycle.e eVar = (androidx.camera.lifecycle.e) v11;
        f1 c11 = new f1.a().c();
        PreviewView previewView = this$0.f43859e;
        if (previewView != null) {
            c11.V(previewView.getSurfaceProvider());
            d0 c12 = new d0.c().c();
            c12.V(executorService, this$0.f43860f);
            r DEFAULT_BACK_CAMERA = r.f3355c;
            u.i(DEFAULT_BACK_CAMERA, "DEFAULT_BACK_CAMERA");
            try {
                eVar.e();
                this$0.f43857c = eVar.c((ComponentActivity) context, DEFAULT_BACK_CAMERA, c11, c12);
                return;
            } catch (IllegalStateException e11) {
                x70.b.b(this$0, "Camera for Wifi QR code - cameraProvider.bindToLifecycle IllegalStateException : " + e11, new Object[0]);
                return;
            }
        }
        u.s("previewView");
        throw null;
    }

    public static void B3(QRCodeScannerActivity this$0, Boolean bool) {
        String str;
        u.j(this$0, "this$0");
        int i11 = v70.a.f103433b;
        u.g(bool);
        if (bool.booleanValue()) {
            str = "granted";
        } else {
            str = "denied";
        }
        v70.a.d(AttributionReporter.SYSTEM_PERMISSION, AttributionReporter.SYSTEM_PERMISSION, s0.i(new j("internal_storage", str)), true);
        boolean booleanValue = bool.booleanValue();
        g gVar = this$0.f43855a;
        if (booleanValue) {
            ((k) gVar.getValue()).b(this$0.H3());
            e.a aVar = new e.a();
            aVar.b();
            this$0.f43863i.a(aVar.a());
            return;
        }
        Toast.makeText(this$0, this$0.getString(C1987R.string.installation_device_wifi_setup_qrcode_internalstoragepermission_error), 1).show();
        if (androidx.core.app.a.h(this$0, this$0.H3())) {
            ((k) gVar.getValue()).b(this$0.H3());
        }
    }

    public static final PreviewView D3(final QRCodeScannerActivity qRCodeScannerActivity, final Context context) {
        qRCodeScannerActivity.getClass();
        final ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
        PreviewView previewView = new PreviewView(context, null);
        previewView.setScaleType(PreviewView.ScaleType.FILL_CENTER);
        qRCodeScannerActivity.f43859e = previewView;
        final i<androidx.camera.lifecycle.e> d11 = androidx.camera.lifecycle.e.d(context);
        ((z.d) d11).a(new Runnable() { // from class: g40.d
            @Override // java.lang.Runnable
            public final void run() {
                QRCodeScannerActivity.A3(i.this, qRCodeScannerActivity, context, newSingleThreadExecutor);
            }
        }, androidx.core.content.a.getMainExecutor(context));
        PreviewView previewView2 = qRCodeScannerActivity.f43859e;
        if (previewView2 != null) {
            return previewView2;
        }
        u.s("previewView");
        throw null;
    }

    public static final void F3(QRCodeScannerActivity qRCodeScannerActivity) {
        if (androidx.core.content.a.checkSelfPermission(qRCodeScannerActivity, qRCodeScannerActivity.H3()) == 0) {
            e.a aVar = new e.a();
            aVar.b();
            qRCodeScannerActivity.f43863i.a(aVar.a());
            return;
        }
        boolean a11 = ((k) qRCodeScannerActivity.f43855a.getValue()).a(qRCodeScannerActivity.H3());
        boolean h11 = androidx.core.app.a.h(qRCodeScannerActivity, qRCodeScannerActivity.H3());
        if (!a11 && !h11) {
            qc.b bVar = new qc.b(qRCodeScannerActivity);
            bVar.g(C1987R.string.installation_device_wifi_setup_qrcode_internalstoragepermission_error);
            bVar.z(C1987R.string._ANDROID_SETUP_CANCEL_WARNING_CONFIRM_, new zn.b(qRCodeScannerActivity, 1)).w(C1987R.string._NO_, new g40.c(0)).s();
            return;
        }
        qRCodeScannerActivity.f43862h.a(qRCodeScannerActivity.H3());
    }

    public static final void G3(QRCodeScannerActivity qRCodeScannerActivity) {
        if (((Boolean) qRCodeScannerActivity.f43858d.getValue()).booleanValue()) {
            ParcelableSnapshotMutableState parcelableSnapshotMutableState = qRCodeScannerActivity.f43861g;
            parcelableSnapshotMutableState.setValue(Boolean.valueOf(!((Boolean) parcelableSnapshotMutableState.getValue()).booleanValue()));
            l lVar = qRCodeScannerActivity.f43857c;
            if (lVar != null) {
                lVar.a().c(((Boolean) parcelableSnapshotMutableState.getValue()).booleanValue());
            } else {
                u.s("camera");
                throw null;
            }
        }
    }

    private final String H3() {
        return (String) this.f43856b.getValue();
    }

    public static void z3(QRCodeScannerActivity this$0, Uri uri) {
        u.j(this$0, "this$0");
        int i11 = v70.a.f103433b;
        v70.a.d("qrcode_library", "qrcode_library", null, true);
        if (uri != null) {
            this$0.f43860f.b(this$0, uri);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle extras = getIntent().getExtras();
        int i11 = -1;
        if (extras != null) {
            i11 = extras.getInt("qrcode_analyzer_type", -1);
        }
        if (androidx.core.content.a.checkSelfPermission(this, "android.permission.CAMERA") != 0) {
            finish();
        }
        e.k.a(this, new s1.a(true, 48226244, new d(i11, this)));
    }
}
