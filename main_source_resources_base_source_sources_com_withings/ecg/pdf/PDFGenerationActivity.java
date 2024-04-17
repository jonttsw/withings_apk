package com.withings.ecg.pdf;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.view.View;
import androidx.activity.ComponentActivity;
import androidx.camera.core.v;
import androidx.lifecycle.l0;
import by.kirich1409.viewbindingdelegate.LifecycleViewBindingProperty;
import com.withings.ecg.model.HeartSignalRepository;
import com.withings.features.platform.model.PlatformFeatureRepository;
import com.withings.features.platform.model.RoomPlatformFeatureRepository;
import com.withings.user.User;
import com.withings.wiscale2.C1987R;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
/* compiled from: PDFGenerationActivity.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/withings/ecg/pdf/PDFGenerationActivity;", "Lcom/withings/android/activity/WithingsActivity;", "<init>", "()V", "a", "ecg_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class PDFGenerationActivity extends Hilt_PDFGenerationActivity {
    @Inject

    /* renamed from: e  reason: collision with root package name */
    public fy.m f38724e;
    @Inject

    /* renamed from: f  reason: collision with root package name */
    public jq.b f38725f;

    /* renamed from: g  reason: collision with root package name */
    private final c f38726g;

    /* renamed from: h  reason: collision with root package name */
    private final by.kirich1409.viewbindingdelegate.f f38727h;

    /* renamed from: i  reason: collision with root package name */
    private final nm0.g f38728i;

    /* renamed from: k  reason: collision with root package name */
    static final /* synthetic */ fn0.k<Object>[] f38723k = {v.c(PDFGenerationActivity.class, "ecgId", "getEcgId()J", 0), v.c(PDFGenerationActivity.class, "binding", "getBinding()Lcom/withings/ecg/databinding/ActivityPdfProcessingBinding;", 0)};

    /* renamed from: j  reason: collision with root package name */
    public static final a f38722j = new Object();

    /* compiled from: PDFGenerationActivity.kt */
    /* loaded from: classes3.dex */
    public static final class a {
    }

    /* compiled from: PDFGenerationActivity.kt */
    /* loaded from: classes3.dex */
    static final class b implements l0, kotlin.jvm.internal.p {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ ym0.l f38729a;

        b(ym0.l lVar) {
            this.f38729a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof l0) || !(obj instanceof kotlin.jvm.internal.p)) {
                return false;
            }
            return u.e(this.f38729a, ((kotlin.jvm.internal.p) obj).getFunctionDelegate());
        }

        @Override // kotlin.jvm.internal.p
        public final nm0.d<?> getFunctionDelegate() {
            return this.f38729a;
        }

        public final int hashCode() {
            return this.f38729a.hashCode();
        }

        @Override // androidx.lifecycle.l0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f38729a.invoke(obj);
        }
    }

    /* compiled from: Activity.kt */
    /* loaded from: classes3.dex */
    public static final class c implements bn0.d<Activity, Long> {

        /* renamed from: a  reason: collision with root package name */
        private final nm0.g f38730a = nm0.h.b(new k(this));

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Activity f38731b;

        public c(Activity activity) {
            this.f38731b = activity;
        }

        /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Long, java.lang.Object] */
        @Override // bn0.d
        public final Long getValue(Activity activity, fn0.k property) {
            Activity thisRef = activity;
            u.j(thisRef, "thisRef");
            u.j(property, "property");
            return this.f38730a.getValue();
        }
    }

    /* compiled from: ActivityViewBindings.kt */
    /* loaded from: classes3.dex */
    public static final class d extends w implements ym0.l<ComponentActivity, kq.a> {
        @Override // ym0.l
        public final kq.a invoke(ComponentActivity componentActivity) {
            ComponentActivity activity = componentActivity;
            u.j(activity, "activity");
            View e11 = androidx.core.app.a.e(activity, C1987R.id.container);
            u.i(e11, "requireViewById(this, id)");
            return kq.a.a(e11);
        }
    }

    /* compiled from: PDFGenerationActivity.kt */
    /* loaded from: classes3.dex */
    static final class e extends w implements ym0.a<com.withings.ecg.pdf.b> {
        e() {
            super(0);
        }

        @Override // ym0.a
        public final com.withings.ecg.pdf.b invoke() {
            PDFGenerationActivity pDFGenerationActivity = PDFGenerationActivity.this;
            Application application = pDFGenerationActivity.getApplication();
            u.i(application, "getApplication(...)");
            User e11 = m70.i.b().e();
            u.i(e11, "getMainUser(...)");
            long A3 = PDFGenerationActivity.A3(pDFGenerationActivity);
            HeartSignalRepository heartSignalRepository = androidx.compose.foundation.lazy.layout.d.f4443b;
            if (heartSignalRepository != null) {
                PlatformFeatureRepository platformFeatureRepository = RoomPlatformFeatureRepository.Companion.get();
                fy.m mVar = pDFGenerationActivity.f38724e;
                if (mVar != null) {
                    jq.b bVar = pDFGenerationActivity.f38725f;
                    if (bVar != null) {
                        return new com.withings.ecg.pdf.b(application, PDFGenerationActivity.this, e11, A3, heartSignalRepository, platformFeatureRepository, mVar, bVar);
                    }
                    u.s("deviceDiagnosticStringResourcesProvider");
                    throw null;
                }
                u.s("getMeasureGroupWithDeviceIdAndTimestampUseCase");
                throw null;
            }
            u.s("heartSignalRepository");
            throw null;
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [ym0.l, kotlin.jvm.internal.w] */
    public PDFGenerationActivity() {
        super(0);
        this.f38726g = new c(this);
        this.f38727h = by.kirich1409.viewbindingdelegate.b.a(this, u9.a.a(), new w(1));
        this.f38728i = nm0.h.b(new e());
    }

    public static final long A3(PDFGenerationActivity pDFGenerationActivity) {
        return ((Number) pDFGenerationActivity.f38726g.getValue(pDFGenerationActivity, f38723k[0])).longValue();
    }

    public static final kq.a z3(PDFGenerationActivity pDFGenerationActivity) {
        Object value = ((LifecycleViewBindingProperty) pDFGenerationActivity.f38727h).getValue(pDFGenerationActivity, f38723k[1]);
        u.i(value, "getValue(...)");
        return (kq.a) value;
    }

    @Override // com.withings.ecg.pdf.Hilt_PDFGenerationActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ((com.withings.ecg.pdf.b) this.f38728i.getValue()).k0().observe(this, new b(new j(this)));
    }
}
