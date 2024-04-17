package com.withings.ecg.pdf;

import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.withings.ecg.model.SignalMeta;
import com.withings.library.authentication.api.ConstantsWs;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import m0.t;
import nm0.y;
import org.joda.time.DateTime;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SixLeadEcgPDF.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.ecg.pdf.SixLeadEcgPDF$generateAndSavePage$2", f = "SixLeadEcgPDF.kt", l = {ConstantsWs.MEASURE_TYPE_VASISTAS_WALKING_DOUBLE_SUPPORT}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class o extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f38805a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ kq.e f38806b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ r f38807c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ SignalMeta f38808d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ DateTime f38809e;

    /* compiled from: SixLeadEcgPDF.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.ecg.pdf.SixLeadEcgPDF$generateAndSavePage$2$1$1", f = "SixLeadEcgPDF.kt", l = {ConstantsWs.MEASURE_TYPE_FAT_MASS_SEGMENT, ConstantsWs.MEASURE_TYPE_MUSCLE_MASS_SEGMENT}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    static final class a extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f38810a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ r f38811b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ kq.e f38812c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ SignalMeta f38813d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ DateTime f38814e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(kq.e eVar, SignalMeta signalMeta, r rVar, qm0.d dVar, DateTime dateTime) {
            super(2, dVar);
            this.f38811b = rVar;
            this.f38812c = eVar;
            this.f38813d = signalMeta;
            this.f38814e = dateTime;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
            return new a(this.f38812c, this.f38813d, this.f38811b, dVar, this.f38814e);
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super y> dVar) {
            return ((a) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            int i11;
            Object obj2 = CoroutineSingletons.f76214a;
            int i12 = this.f38810a;
            kq.e eVar = this.f38812c;
            r rVar = this.f38811b;
            if (i12 != 0) {
                if (i12 != 1) {
                    if (i12 == 2) {
                        nm0.l.b(obj);
                        return y.f85009a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                nm0.l.b(obj);
            } else {
                nm0.l.b(obj);
                i11 = rVar.f38836e;
                this.f38810a = 1;
                rVar.getClass();
                Object withContext = BuildersKt.withContext(Dispatchers.getIO(), new p(i11, eVar, rVar, null), this);
                if (withContext != obj2) {
                    withContext = y.f85009a;
                }
                if (withContext == obj2) {
                    return obj2;
                }
            }
            this.f38810a = 2;
            if (r.h(eVar, this.f38813d, rVar, this, this.f38814e) == obj2) {
                return obj2;
            }
            return y.f85009a;
        }
    }

    /* compiled from: View.kt */
    /* loaded from: classes3.dex */
    public static final class b implements View.OnLayoutChangeListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ r f38815a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ kq.e f38816b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ SignalMeta f38817c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ DateTime f38818d;

        public b(r rVar, kq.e eVar, SignalMeta signalMeta, DateTime dateTime) {
            this.f38815a = rVar;
            this.f38816b = eVar;
            this.f38817c = signalMeta;
            this.f38818d = dateTime;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(View view, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
            WeakReference weakReference;
            view.removeOnLayoutChangeListener(this);
            weakReference = this.f38815a.f38833b;
            AppCompatActivity appCompatActivity = (AppCompatActivity) weakReference.get();
            if (appCompatActivity != null) {
                BuildersKt__Builders_commonKt.launch$default(t.l(appCompatActivity), null, null, new a(this.f38816b, this.f38817c, this.f38815a, null, this.f38818d), 3, null);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(kq.e eVar, SignalMeta signalMeta, r rVar, qm0.d dVar, DateTime dateTime) {
        super(2, dVar);
        this.f38806b = eVar;
        this.f38807c = rVar;
        this.f38808d = signalMeta;
        this.f38809e = dateTime;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
        return new o(this.f38806b, this.f38808d, this.f38807c, dVar, this.f38809e);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super y> dVar) {
        return ((o) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        int i11;
        boolean z5;
        int i12;
        int i13;
        boolean z11;
        int i14;
        int i15;
        boolean z12;
        List list;
        int i16;
        Object obj2 = CoroutineSingletons.f76214a;
        int i17 = this.f38805a;
        r rVar = this.f38807c;
        kq.e eVar = this.f38806b;
        if (i17 != 0) {
            if (i17 == 1) {
                nm0.l.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            nm0.l.b(obj);
            TextView bpm = eVar.f78089b;
            u.i(bpm, "bpm");
            i11 = rVar.f38836e;
            int i18 = 0;
            if (i11 != 0) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (z5) {
                i12 = 4;
            } else {
                i12 = 0;
            }
            bpm.setVisibility(i12);
            TextView diagnosis = eVar.f78092e;
            u.i(diagnosis, "diagnosis");
            i13 = rVar.f38836e;
            if (i13 != 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                i14 = 4;
            } else {
                i14 = 0;
            }
            diagnosis.setVisibility(i14);
            TextView signalContext = eVar.f78094g;
            u.i(signalContext, "signalContext");
            i15 = rVar.f38836e;
            if (i15 != 0) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (z12) {
                i18 = 4;
            }
            signalContext.setVisibility(i18);
            PDFGraphContainer pDFGraphContainer = eVar.f78093f;
            list = rVar.f38837f;
            if (list != null) {
                i16 = rVar.f38836e;
                this.f38805a = 1;
                pDFGraphContainer.getClass();
                Object withContext = BuildersKt.withContext(Dispatchers.getMain(), new m(pDFGraphContainer, (Map) list.get(i16), null), this);
                if (withContext != obj2) {
                    withContext = y.f85009a;
                }
                if (withContext == obj2) {
                    return obj2;
                }
            } else {
                u.s("linesData");
                throw null;
            }
        }
        ConstraintLayout containerPdf = eVar.f78091d;
        u.i(containerPdf, "containerPdf");
        containerPdf.addOnLayoutChangeListener(new b(rVar, eVar, this.f38808d, this.f38809e));
        eVar.f78091d.invalidate();
        return y.f85009a;
    }
}
