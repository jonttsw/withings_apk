package com.withings.wiscale2.device.common.feature.ecg.us.hwa10.ui.call;

import ah.o;
import androidx.camera.camera2.internal.q2;
import androidx.compose.runtime.a;
import androidx.compose.runtime.l0;
import androidx.compose.runtime.v;
import androidx.compose.runtime.v0;
import androidx.compose.ui.platform.k4;
import androidx.compose.ui.platform.n1;
import androidx.lifecycle.h1;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.huawei.hms.feature.dynamic.ModuleCopy;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.wiscale2.C1987R;
import com.withings.wiscale2.device.common.feature.ecg.us.hwa10.ui.call.VideoCallPhoneNumberViewModel;
import java.util.Locale;
import k1.r0;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.MutableSharedFlow;
import nm0.y;
import okhttp3.internal.http2.Http2;
import r0.x;
import wk.c0;
import ym0.p;
import ym0.q;
/* compiled from: VideoCallPhoneNumberScreen.kt */
/* loaded from: classes5.dex */
public final class f {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: VideoCallPhoneNumberScreen.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.device.common.feature.ecg.us.hwa10.ui.call.VideoCallPhoneNumberScreenKt$VideoCallPhoneNumberScreen$1", f = "VideoCallPhoneNumberScreen.kt", l = {82}, m = "invokeSuspend")
    /* loaded from: classes5.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.i implements p<CoroutineScope, qm0.d<? super y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f51890a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ VideoCallPhoneNumberViewModel f51891b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ r0<Boolean> f51892c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ ym0.a<y> f51893d;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: VideoCallPhoneNumberScreen.kt */
        /* renamed from: com.withings.wiscale2.device.common.feature.ecg.us.hwa10.ui.call.f$a$a  reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        public static final class C0698a<T> implements FlowCollector {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ r0<Boolean> f51894a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ ym0.a<y> f51895b;

            C0698a(r0<Boolean> r0Var, ym0.a<y> aVar) {
                this.f51894a = r0Var;
                this.f51895b = aVar;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public final Object emit(Object obj, qm0.d dVar) {
                int ordinal = ((VideoCallPhoneNumberViewModel.Error) obj).ordinal();
                if (ordinal != 0) {
                    if (ordinal == 1) {
                        this.f51895b.invoke();
                    }
                } else {
                    this.f51894a.setValue(Boolean.TRUE);
                }
                return y.f85009a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(VideoCallPhoneNumberViewModel videoCallPhoneNumberViewModel, r0<Boolean> r0Var, ym0.a<y> aVar, qm0.d<? super a> dVar) {
            super(2, dVar);
            this.f51891b = videoCallPhoneNumberViewModel;
            this.f51892c = r0Var;
            this.f51893d = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
            return new a(this.f51891b, this.f51892c, this.f51893d, dVar);
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super y> dVar) {
            ((a) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
            return CoroutineSingletons.f76214a;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            int i11 = this.f51890a;
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                nm0.l.b(obj);
            } else {
                nm0.l.b(obj);
                MutableSharedFlow<VideoCallPhoneNumberViewModel.Error> m02 = this.f51891b.m0();
                C0698a c0698a = new C0698a(this.f51892c, this.f51893d);
                this.f51890a = 1;
                if (m02.collect(c0698a, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            throw new KotlinNothingValueException();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: VideoCallPhoneNumberScreen.kt */
    /* loaded from: classes5.dex */
    public static final class b extends w implements p<androidx.compose.runtime.a, Integer, y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ym0.a<y> f51896a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f51897b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ym0.l<String, y> f51898c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ ym0.l<Boolean, y> f51899d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ boolean f51900e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ String f51901f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ boolean f51902g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ ym0.a<y> f51903h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ ym0.a<y> f51904i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ int f51905j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(ym0.a<y> aVar, String str, ym0.l<? super String, y> lVar, ym0.l<? super Boolean, y> lVar2, boolean z5, String str2, boolean z11, ym0.a<y> aVar2, ym0.a<y> aVar3, int i11) {
            super(2);
            this.f51896a = aVar;
            this.f51897b = str;
            this.f51898c = lVar;
            this.f51899d = lVar2;
            this.f51900e = z5;
            this.f51901f = str2;
            this.f51902g = z11;
            this.f51903h = aVar2;
            this.f51904i = aVar3;
            this.f51905j = i11;
        }

        @Override // ym0.p
        public final y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = o.g(this.f51905j | 1);
            ym0.a<y> aVar2 = this.f51903h;
            ym0.a<y> aVar3 = this.f51904i;
            f.b(this.f51896a, this.f51897b, this.f51898c, this.f51899d, this.f51900e, this.f51901f, this.f51902g, aVar2, aVar3, aVar, g11);
            return y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: VideoCallPhoneNumberScreen.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.device.common.feature.ecg.us.hwa10.ui.call.VideoCallPhoneNumberScreenKt$VideoCallPhoneNumberScreen$2", f = "VideoCallPhoneNumberScreen.kt", l = {90}, m = "invokeSuspend")
    /* loaded from: classes5.dex */
    public static final class c extends kotlin.coroutines.jvm.internal.i implements p<CoroutineScope, qm0.d<? super y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f51906a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ VideoCallPhoneNumberViewModel f51907b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ym0.l<String, y> f51908c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: VideoCallPhoneNumberScreen.kt */
        /* loaded from: classes5.dex */
        public static final class a<T> implements FlowCollector {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ ym0.l<String, y> f51909a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ VideoCallPhoneNumberViewModel f51910b;

            /* JADX WARN: Multi-variable type inference failed */
            a(ym0.l<? super String, y> lVar, VideoCallPhoneNumberViewModel videoCallPhoneNumberViewModel) {
                this.f51909a = lVar;
                this.f51910b = videoCallPhoneNumberViewModel;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public final Object emit(Object obj, qm0.d dVar) {
                y yVar = (y) obj;
                String value = this.f51910b.k0().getValue();
                if (value == null) {
                    value = "";
                }
                this.f51909a.invoke(value);
                return y.f85009a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(VideoCallPhoneNumberViewModel videoCallPhoneNumberViewModel, ym0.l<? super String, y> lVar, qm0.d<? super c> dVar) {
            super(2, dVar);
            this.f51907b = videoCallPhoneNumberViewModel;
            this.f51908c = lVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
            return new c(this.f51907b, this.f51908c, dVar);
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super y> dVar) {
            ((c) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
            return CoroutineSingletons.f76214a;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            int i11 = this.f51906a;
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                nm0.l.b(obj);
            } else {
                nm0.l.b(obj);
                VideoCallPhoneNumberViewModel videoCallPhoneNumberViewModel = this.f51907b;
                MutableSharedFlow<y> p02 = videoCallPhoneNumberViewModel.p0();
                a aVar = new a(this.f51908c, videoCallPhoneNumberViewModel);
                this.f51906a = 1;
                if (p02.collect(aVar, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            throw new KotlinNothingValueException();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: VideoCallPhoneNumberScreen.kt */
    /* loaded from: classes5.dex */
    public static final class d extends w implements ym0.l<String, y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ VideoCallPhoneNumberViewModel f51911a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(VideoCallPhoneNumberViewModel videoCallPhoneNumberViewModel) {
            super(1);
            this.f51911a = videoCallPhoneNumberViewModel;
        }

        @Override // ym0.l
        public final y invoke(String str) {
            String it = str;
            u.j(it, "it");
            this.f51911a.k0().setValue(it);
            return y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: VideoCallPhoneNumberScreen.kt */
    /* loaded from: classes5.dex */
    public static final class e extends w implements ym0.l<Boolean, y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ VideoCallPhoneNumberViewModel f51912a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(VideoCallPhoneNumberViewModel videoCallPhoneNumberViewModel) {
            super(1);
            this.f51912a = videoCallPhoneNumberViewModel;
        }

        @Override // ym0.l
        public final y invoke(Boolean bool) {
            Boolean bool2 = bool;
            bool2.booleanValue();
            this.f51912a.q0().setValue(bool2);
            return y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: VideoCallPhoneNumberScreen.kt */
    /* renamed from: com.withings.wiscale2.device.common.feature.ecg.us.hwa10.ui.call.f$f  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public /* synthetic */ class C0699f extends s implements ym0.a<y> {
        C0699f(Object obj) {
            super(0, obj, VideoCallPhoneNumberViewModel.class, "sendPhoneNumber", "sendPhoneNumber()V", 0);
        }

        @Override // ym0.a
        public final /* bridge */ /* synthetic */ y invoke() {
            m();
            return y.f85009a;
        }

        public final void m() {
            VideoCallPhoneNumberViewModel videoCallPhoneNumberViewModel = (VideoCallPhoneNumberViewModel) this.receiver;
            videoCallPhoneNumberViewModel.getClass();
            BuildersKt__Builders_commonKt.launch$default(h1.a(videoCallPhoneNumberViewModel), Dispatchers.getIO(), null, new l(videoCallPhoneNumberViewModel, null), 2, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: VideoCallPhoneNumberScreen.kt */
    /* loaded from: classes5.dex */
    public static final class g extends w implements p<androidx.compose.runtime.a, Integer, y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ VideoCallPhoneNumberViewModel f51913a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ym0.a<y> f51914b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ym0.a<y> f51915c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ ym0.a<y> f51916d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ ym0.l<String, y> f51917e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ int f51918f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        g(VideoCallPhoneNumberViewModel videoCallPhoneNumberViewModel, ym0.a<y> aVar, ym0.a<y> aVar2, ym0.a<y> aVar3, ym0.l<? super String, y> lVar, int i11) {
            super(2);
            this.f51913a = videoCallPhoneNumberViewModel;
            this.f51914b = aVar;
            this.f51915c = aVar2;
            this.f51916d = aVar3;
            this.f51917e = lVar;
            this.f51918f = i11;
        }

        @Override // ym0.p
        public final y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = o.g(this.f51918f | 1);
            ym0.a<y> aVar2 = this.f51916d;
            ym0.l<String, y> lVar = this.f51917e;
            f.a(this.f51913a, this.f51914b, this.f51915c, aVar2, lVar, aVar, g11);
            return y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: VideoCallPhoneNumberScreen.kt */
    /* loaded from: classes5.dex */
    public static final class h extends w implements p<androidx.compose.runtime.a, Integer, y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ boolean f51919a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f51920b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ym0.a<y> f51921c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(boolean z5, boolean z11, ym0.a<y> aVar) {
            super(2);
            this.f51919a = z5;
            this.f51920b = z11;
            this.f51921c = aVar;
        }

        @Override // ym0.p
        public final y invoke(androidx.compose.runtime.a aVar, Integer num) {
            androidx.compose.runtime.a aVar2 = aVar;
            if ((num.intValue() & 11) == 2 && aVar2.h()) {
                aVar2.C();
            } else {
                com.withings.common.compose.component.l.a(null, ay.b.u(C1987R.string._NEXT_, aVar2), null, this.f51919a, null, null, this.f51920b, this.f51921c, aVar2, 0, 53);
            }
            return y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: VideoCallPhoneNumberScreen.kt */
    /* loaded from: classes5.dex */
    public static final class i extends w implements p<androidx.compose.runtime.a, Integer, y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ym0.a<y> f51922a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(ym0.a<y> aVar) {
            super(2);
            this.f51922a = aVar;
        }

        @Override // ym0.p
        public final y invoke(androidx.compose.runtime.a aVar, Integer num) {
            androidx.compose.runtime.a aVar2 = aVar;
            if ((num.intValue() & 11) == 2 && aVar2.h()) {
                aVar2.C();
            } else {
                com.withings.common.compose.component.l.c(null, ay.b.u(C1987R.string.i_need_help, aVar2), null, false, null, null, false, this.f51922a, aVar2, 0, 125);
            }
            return y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: VideoCallPhoneNumberScreen.kt */
    /* loaded from: classes5.dex */
    public static final class j extends w implements q<r0.h, androidx.compose.runtime.a, Integer, y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f51923a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f51924b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ym0.l<String, y> f51925c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ ym0.l<Boolean, y> f51926d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ boolean f51927e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ ym0.a<y> f51928f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        j(String str, String str2, ym0.l<? super String, y> lVar, ym0.l<? super Boolean, y> lVar2, boolean z5, ym0.a<y> aVar) {
            super(3);
            this.f51923a = str;
            this.f51924b = str2;
            this.f51925c = lVar;
            this.f51926d = lVar2;
            this.f51927e = z5;
            this.f51928f = aVar;
        }

        @Override // ym0.q
        public final y invoke(r0.h hVar, androidx.compose.runtime.a aVar, Integer num) {
            boolean z5;
            r0.h GuidedPresentation = hVar;
            androidx.compose.runtime.a aVar2 = aVar;
            int intValue = num.intValue();
            u.j(GuidedPresentation, "$this$GuidedPresentation");
            if ((intValue & 81) == 16 && aVar2.h()) {
                aVar2.C();
            } else {
                Object a11 = q2.a(aVar2, 773894976, -492369756);
                if (a11 == a.C0060a.a()) {
                    a11 = androidx.camera.camera2.internal.q.b(k1.y.i(aVar2), aVar2);
                }
                aVar2.J();
                CoroutineScope a12 = ((androidx.compose.runtime.k) a11).a();
                aVar2.J();
                k4 k4Var = (k4) aVar2.D(n1.m());
                aVar2.s(-1997165517);
                Object t11 = aVar2.t();
                if (t11 == a.C0060a.a()) {
                    t11 = l0.f(Locale.US, v0.f8878a);
                    aVar2.n(t11);
                }
                r0 r0Var = (r0) t11;
                aVar2.J();
                String str = this.f51923a;
                if (str == null) {
                    str = "";
                }
                androidx.compose.ui.text.b bVar = null;
                String str2 = this.f51924b;
                if (str2 != null) {
                    bVar = new androidx.compose.ui.text.b(str2, null, 6);
                }
                if (str2 != null) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                com.withings.wiscale2.device.common.feature.ecg.us.hwa10.ui.call.h hVar2 = new com.withings.wiscale2.device.common.feature.ecg.us.hwa10.ui.call.h(a12, k4Var);
                com.withings.wiscale2.device.common.feature.ecg.us.hwa10.ui.call.j jVar = new com.withings.wiscale2.device.common.feature.ecg.us.hwa10.ui.call.j(this.f51927e, this.f51928f, a12, k4Var);
                aVar2.s(-1997164954);
                ym0.l<String, y> lVar = this.f51925c;
                boolean K = aVar2.K(lVar);
                Object t12 = aVar2.t();
                if (K || t12 == a.C0060a.a()) {
                    t12 = new k(lVar);
                    aVar2.n(t12);
                }
                aVar2.J();
                fk.y.a(null, str, r0Var, bVar, z5, hVar2, 0, jVar, (p) t12, this.f51926d, null, aVar2, ConstantsWs.WS_STATUS_LOGIN_UNAUTHORIZED, 0, 1089);
            }
            return y.f85009a;
        }
    }

    public static final void a(VideoCallPhoneNumberViewModel viewModel, ym0.a<y> navigateUp, ym0.a<y> navigateToHelpScreen, ym0.a<y> navigateToError, ym0.l<? super String, y> next, androidx.compose.runtime.a aVar, int i11) {
        u.j(viewModel, "viewModel");
        u.j(navigateUp, "navigateUp");
        u.j(navigateToHelpScreen, "navigateToHelpScreen");
        u.j(navigateToError, "navigateToError");
        u.j(next, "next");
        androidx.compose.runtime.b g11 = aVar.g(948112740);
        r0 b10 = l0.b(viewModel.k0(), g11);
        r0 b11 = l0.b(viewModel.q0(), g11);
        g11.s(482760629);
        Object t11 = g11.t();
        if (t11 == a.C0060a.a()) {
            t11 = l0.f(Boolean.FALSE, v0.f8878a);
            g11.n(t11);
        }
        r0 r0Var = (r0) t11;
        g11.J();
        r0 b12 = l0.b(viewModel.r0(), g11);
        String str = null;
        k1.y.f("phoneNumberErrorEvent", new a(viewModel, r0Var, navigateToError, null), g11);
        k1.y.f("phoneNumberSentEvent", new c(viewModel, next, null), g11);
        String str2 = (String) b10.getValue();
        d dVar = new d(viewModel);
        e eVar = new e(viewModel);
        boolean booleanValue = ((Boolean) b11.getValue()).booleanValue();
        g11.s(482761549);
        if (((Boolean) r0Var.getValue()).booleanValue()) {
            str = ay.b.u(C1987R.string._ERROR_, g11);
        }
        g11.J();
        b(navigateUp, str2, dVar, eVar, booleanValue, str, ((Boolean) b12.getValue()).booleanValue(), new C0699f(viewModel), navigateToHelpScreen, g11, ((i11 >> 3) & 14) | ((i11 << 18) & 234881024));
        v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new g(viewModel, navigateUp, navigateToHelpScreen, navigateToError, next, i11));
        }
    }

    public static final void b(ym0.a<y> onBackClicked, String str, ym0.l<? super String, y> onPhoneNumberChanged, ym0.l<? super Boolean, y> onPhoneValidityChanged, boolean z5, String str2, boolean z11, ym0.a<y> onPhoneConfirmed, ym0.a<y> onNeedHelp, androidx.compose.runtime.a aVar, int i11) {
        int i12;
        androidx.compose.runtime.b bVar;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i21;
        int i22;
        u.j(onBackClicked, "onBackClicked");
        u.j(onPhoneNumberChanged, "onPhoneNumberChanged");
        u.j(onPhoneValidityChanged, "onPhoneValidityChanged");
        u.j(onPhoneConfirmed, "onPhoneConfirmed");
        u.j(onNeedHelp, "onNeedHelp");
        androidx.compose.runtime.b g11 = aVar.g(565379653);
        if ((i11 & 14) == 0) {
            if (g11.w(onBackClicked)) {
                i22 = 4;
            } else {
                i22 = 2;
            }
            i12 = i22 | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 112) == 0) {
            if (g11.K(str)) {
                i21 = 32;
            } else {
                i21 = 16;
            }
            i12 |= i21;
        }
        if ((i11 & ConstantsWs.HWFAILURE_ZERO) == 0) {
            if (g11.w(onPhoneNumberChanged)) {
                i19 = 256;
            } else {
                i19 = 128;
            }
            i12 |= i19;
        }
        if ((i11 & 7168) == 0) {
            if (g11.w(onPhoneValidityChanged)) {
                i18 = ModuleCopy.f28574b;
            } else {
                i18 = 1024;
            }
            i12 |= i18;
        }
        if ((57344 & i11) == 0) {
            if (g11.a(z5)) {
                i17 = Http2.INITIAL_MAX_FRAME_SIZE;
            } else {
                i17 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
            }
            i12 |= i17;
        }
        if ((458752 & i11) == 0) {
            if (g11.K(str2)) {
                i16 = 131072;
            } else {
                i16 = 65536;
            }
            i12 |= i16;
        }
        if ((3670016 & i11) == 0) {
            if (g11.a(z11)) {
                i15 = 1048576;
            } else {
                i15 = 524288;
            }
            i12 |= i15;
        }
        if ((29360128 & i11) == 0) {
            if (g11.w(onPhoneConfirmed)) {
                i14 = 8388608;
            } else {
                i14 = 4194304;
            }
            i12 |= i14;
        }
        if ((234881024 & i11) == 0) {
            if (g11.w(onNeedHelp)) {
                i13 = 67108864;
            } else {
                i13 = 33554432;
            }
            i12 |= i13;
        }
        int i23 = i12;
        if ((i23 & 191739611) == 38347922 && g11.h()) {
            g11.C();
            bVar = g11;
        } else {
            s1.a aVar2 = ac0.a.f567a;
            s1.a b10 = s1.b.b(g11, 737143674, new h(z5, z11, onPhoneConfirmed));
            s1.a b11 = s1.b.b(g11, -263912197, new i(onNeedHelp));
            float o11 = yk.h.o();
            float q11 = yk.h.q();
            bVar = g11;
            c0.b(null, null, null, onBackClicked, null, aVar2, b10, b11, 0L, false, new x(o11, q11, o11, q11), null, 0.0f, false, s1.b.b(g11, -1647829569, new j(str, str2, onPhoneNumberChanged, onPhoneValidityChanged, z5, onPhoneConfirmed)), bVar, ((i23 << 9) & 7168) | 14352384, 24576, 15127);
        }
        v o02 = bVar.o0();
        if (o02 != null) {
            o02.G(new b(onBackClicked, str, onPhoneNumberChanged, onPhoneValidityChanged, z5, str2, z11, onPhoneConfirmed, onNeedHelp, i11));
        }
    }
}
