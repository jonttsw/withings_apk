package com.withings.ecg.pdf;

import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.withings.ecg.model.SignalMeta;
import com.withings.library.authentication.api.ConstantsWs;
import java.lang.ref.WeakReference;
import java.util.List;
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
/* compiled from: OneLeadEcgPDF.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.ecg.pdf.OneLeadEcgPDF$generateAndSavePage$2", f = "OneLeadEcgPDF.kt", l = {ConstantsWs.MEASURE_TYPE_LUTEINIZING_HORMONE}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class g extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f38772a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ f f38773b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ kq.d f38774c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ SignalMeta f38775d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ DateTime f38776e;

    /* compiled from: OneLeadEcgPDF.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.ecg.pdf.OneLeadEcgPDF$generateAndSavePage$2$1$1", f = "OneLeadEcgPDF.kt", l = {ConstantsWs.MEASURE_TYPE_LEUKOCYTES, ConstantsWs.MEASURE_TYPE_HR_SD_NN}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    static final class a extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f38777a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ f f38778b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ kq.d f38779c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ SignalMeta f38780d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ DateTime f38781e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(f fVar, kq.d dVar, SignalMeta signalMeta, DateTime dateTime, qm0.d<? super a> dVar2) {
            super(2, dVar2);
            this.f38778b = fVar;
            this.f38779c = dVar;
            this.f38780d = signalMeta;
            this.f38781e = dateTime;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
            return new a(this.f38778b, this.f38779c, this.f38780d, this.f38781e, dVar);
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super y> dVar) {
            return ((a) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            int i11;
            Object obj2 = CoroutineSingletons.f76214a;
            int i12 = this.f38777a;
            kq.d dVar = this.f38779c;
            f fVar = this.f38778b;
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
                i11 = fVar.f38770e;
                this.f38777a = 1;
                fVar.getClass();
                Object withContext = BuildersKt.withContext(Dispatchers.getIO(), new h(i11, dVar, fVar, null), this);
                if (withContext != obj2) {
                    withContext = y.f85009a;
                }
                if (withContext == obj2) {
                    return obj2;
                }
            }
            this.f38777a = 2;
            if (f.h(fVar, dVar, this.f38780d, this.f38781e, this) == obj2) {
                return obj2;
            }
            return y.f85009a;
        }
    }

    /* compiled from: View.kt */
    /* loaded from: classes3.dex */
    public static final class b implements View.OnLayoutChangeListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f38782a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ kq.d f38783b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ SignalMeta f38784c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ DateTime f38785d;

        public b(f fVar, kq.d dVar, SignalMeta signalMeta, DateTime dateTime) {
            this.f38782a = fVar;
            this.f38783b = dVar;
            this.f38784c = signalMeta;
            this.f38785d = dateTime;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(View view, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
            WeakReference weakReference;
            view.removeOnLayoutChangeListener(this);
            weakReference = this.f38782a.f38767b;
            AppCompatActivity appCompatActivity = (AppCompatActivity) weakReference.get();
            if (appCompatActivity != null) {
                BuildersKt__Builders_commonKt.launch$default(t.l(appCompatActivity), null, null, new a(this.f38782a, this.f38783b, this.f38784c, this.f38785d, null), 3, null);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(f fVar, kq.d dVar, SignalMeta signalMeta, DateTime dateTime, qm0.d<? super g> dVar2) {
        super(2, dVar2);
        this.f38773b = fVar;
        this.f38774c = dVar;
        this.f38775d = signalMeta;
        this.f38776e = dateTime;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
        return new g(this.f38773b, this.f38774c, this.f38775d, this.f38776e, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super y> dVar) {
        return ((g) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        List list;
        List list2;
        int i11;
        int i12;
        Object obj2 = CoroutineSingletons.f76214a;
        int i13 = this.f38772a;
        kq.d dVar = this.f38774c;
        f fVar = this.f38773b;
        if (i13 != 0) {
            if (i13 == 1) {
                nm0.l.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            nm0.l.b(obj);
            list = fVar.f38771f;
            if (list != null) {
                int size = list.size();
                if (size > 3) {
                    size = 3;
                }
                PDFGraphContainer pDFGraphContainer = dVar.f78084f;
                list2 = fVar.f38771f;
                if (list2 != null) {
                    i11 = fVar.f38770e;
                    i12 = fVar.f38770e;
                    List subList = list2.subList(i11 * size, (i12 + 1) * size);
                    this.f38772a = 1;
                    pDFGraphContainer.getClass();
                    Object withContext = BuildersKt.withContext(Dispatchers.getMain(), new n(pDFGraphContainer, subList, null), this);
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
            } else {
                u.s("linesData");
                throw null;
            }
        }
        ConstraintLayout containerPdf = dVar.f78082d;
        u.i(containerPdf, "containerPdf");
        containerPdf.addOnLayoutChangeListener(new b(fVar, dVar, this.f38775d, this.f38776e));
        dVar.f78082d.invalidate();
        return y.f85009a;
    }
}
