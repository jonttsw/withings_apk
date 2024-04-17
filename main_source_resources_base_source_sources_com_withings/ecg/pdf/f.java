package com.withings.ecg.pdf;

import ah.z;
import android.content.Context;
import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import androidx.health.platform.client.proto.x;
import com.itextpdf.text.pdf.n1;
import com.withings.core.utils.WithingsFileProvider;
import com.withings.ecg.graph.EcgEntry;
import com.withings.ecg.model.SignalMeta;
import com.withings.library.authentication.api.ConstantsWs;
import java.io.File;
import java.io.FileOutputStream;
import java.lang.ref.WeakReference;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;
import nm0.y;
import org.joda.time.DateTime;
import ze.w;
/* compiled from: OneLeadEcgPDF.kt */
/* loaded from: classes3.dex */
public final class f extends x {

    /* renamed from: a  reason: collision with root package name */
    private final jq.b f38766a;

    /* renamed from: b  reason: collision with root package name */
    private final WeakReference<AppCompatActivity> f38767b;

    /* renamed from: c  reason: collision with root package name */
    private final File f38768c;

    /* renamed from: d  reason: collision with root package name */
    private int f38769d;

    /* renamed from: e  reason: collision with root package name */
    private int f38770e;

    /* renamed from: f  reason: collision with root package name */
    private List<? extends List<EcgEntry>> f38771f;

    /* compiled from: OneLeadEcgPDF.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002À\u0006\u0003"}, d2 = {"Lcom/withings/ecg/pdf/f$a;", "", "ecg_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes3.dex */
    public interface a {
        ch.d d();
    }

    public f(AppCompatActivity appCompatActivity, jq.b bVar) {
        this.f38766a = bVar;
        this.f38767b = new WeakReference<>(appCompatActivity);
        this.f38768c = appCompatActivity.getCacheDir();
    }

    public static final Object h(f fVar, kq.d dVar, SignalMeta signalMeta, DateTime dateTime, qm0.d dVar2) {
        Context applicationContext;
        int i11 = fVar.f38770e + 1;
        fVar.f38770e = i11;
        if (i11 < fVar.f38769d) {
            Object withContext = BuildersKt.withContext(Dispatchers.getMain(), new g(fVar, dVar, signalMeta, dateTime, null), dVar2);
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            if (withContext != coroutineSingletons) {
                withContext = y.f85009a;
            }
            if (withContext != coroutineSingletons) {
                return y.f85009a;
            }
            return withContext;
        }
        WeakReference<AppCompatActivity> weakReference = fVar.f38767b;
        AppCompatActivity appCompatActivity = weakReference.get();
        if (appCompatActivity != null && (applicationContext = appCompatActivity.getApplicationContext()) != null) {
            ze.y yVar = w.f110518a;
            ze.i iVar = new ze.i(yVar.K());
            File file = new File(fVar.f38768c, ConstantsWs.JSON_SESSION_KEY_ECG);
            file.mkdirs();
            File file2 = new File(file, androidx.fragment.app.o.d("ecg-signal-", dateTime.toString("MM-dd-yyyy_hh:mm_a"), ".pdf"));
            FileOutputStream fileOutputStream = new FileOutputStream(file2);
            try {
                n1.z(iVar, fileOutputStream);
                iVar.a();
                int i12 = fVar.f38769d;
                for (int i13 = 0; i13 < i12; i13++) {
                    iVar.b();
                    iVar.e(0.0f, 0.0f, 0.0f, 0.0f);
                    com.itextpdf.text.c k02 = com.itextpdf.text.c.k0(wm0.b.c(new File(file, "doctor-ecg-" + i13 + ".jpg")));
                    k02.N0(0.0f, 0.0f);
                    k02.O(0.0f);
                    k02.M0(yVar.K());
                    iVar.d(k02);
                }
                iVar.close();
                y yVar2 = y.f85009a;
                ge0.d.a(fileOutputStream, null);
                ch.h m11 = ((a) ah.o.c(applicationContext, a.class)).d().m();
                Context context = dVar.a().getContext();
                u.i(context, "getContext(...)");
                int i14 = WithingsFileProvider.f35394f;
                Context context2 = dVar.a().getContext();
                u.i(context2, "getContext(...)");
                Intent addFlags = ((z) m11).b(context, WithingsFileProvider.a.a(context2, file2), false, null).addFlags(1);
                u.i(addFlags, "addFlags(...)");
                dVar.a().getContext().startActivity(addFlags);
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    ge0.d.a(fileOutputStream, th2);
                    throw th3;
                }
            }
        }
        dVar.f78082d.invalidate();
        AppCompatActivity appCompatActivity2 = weakReference.get();
        if (appCompatActivity2 != null) {
            appCompatActivity2.finish();
        }
        return y.f85009a;
    }

    public static final Object i(f fVar, kq.d dVar, SignalMeta signalMeta, DateTime dateTime, qm0.d dVar2) {
        fVar.getClass();
        Object withContext = BuildersKt.withContext(Dispatchers.getMain(), new g(fVar, dVar, signalMeta, dateTime, null), dVar2);
        if (withContext != CoroutineSingletons.f76214a) {
            return y.f85009a;
        }
        return withContext;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x00cc, code lost:
        if (r5 == null) goto L48;
     */
    @Override // androidx.health.platform.client.proto.x
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(android.widget.FrameLayout r14, com.withings.ecg.pdf.a r15) {
        /*
            Method dump skipped, instructions count: 466
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.ecg.pdf.f.c(android.widget.FrameLayout, com.withings.ecg.pdf.a):void");
    }
}
