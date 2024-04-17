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
import com.google.i18n.phonenumbers.PhoneNumberUtil;
import com.huawei.hms.feature.dynamic.ModuleCopy;
import com.withings.common.compose.component.input.InputFieldType;
import com.withings.common.compose.component.v4;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.wiscale2.C1987R;
import com.withings.wiscale2.device.common.feature.ecg.us.hwa10.ui.call.VideoCallCodeCheckViewModel;
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
/* compiled from: VideoCallCodeCheckScreen.kt */
/* loaded from: classes5.dex */
public final class a {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: VideoCallCodeCheckScreen.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.device.common.feature.ecg.us.hwa10.ui.call.VideoCallCodeCheckScreenKt$VideoCallCodeCheckScreen$1", f = "VideoCallCodeCheckScreen.kt", l = {90}, m = "invokeSuspend")
    /* renamed from: com.withings.wiscale2.device.common.feature.ecg.us.hwa10.ui.call.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public static final class C0695a extends kotlin.coroutines.jvm.internal.i implements p<CoroutineScope, qm0.d<? super y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f51841a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ VideoCallCodeCheckViewModel f51842b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ r0<Boolean> f51843c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ ym0.a<y> f51844d;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: VideoCallCodeCheckScreen.kt */
        /* renamed from: com.withings.wiscale2.device.common.feature.ecg.us.hwa10.ui.call.a$a$a  reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        public static final class C0696a<T> implements FlowCollector {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ r0<Boolean> f51845a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ ym0.a<y> f51846b;

            C0696a(r0<Boolean> r0Var, ym0.a<y> aVar) {
                this.f51845a = r0Var;
                this.f51846b = aVar;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public final Object emit(Object obj, qm0.d dVar) {
                int ordinal = ((VideoCallCodeCheckViewModel.Error) obj).ordinal();
                if (ordinal != 0) {
                    if (ordinal == 1 || ordinal == 2) {
                        this.f51846b.invoke();
                    }
                } else {
                    this.f51845a.setValue(Boolean.TRUE);
                }
                return y.f85009a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0695a(VideoCallCodeCheckViewModel videoCallCodeCheckViewModel, r0<Boolean> r0Var, ym0.a<y> aVar, qm0.d<? super C0695a> dVar) {
            super(2, dVar);
            this.f51842b = videoCallCodeCheckViewModel;
            this.f51843c = r0Var;
            this.f51844d = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
            return new C0695a(this.f51842b, this.f51843c, this.f51844d, dVar);
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super y> dVar) {
            ((C0695a) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
            return CoroutineSingletons.f76214a;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            int i11 = this.f51841a;
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                nm0.l.b(obj);
            } else {
                nm0.l.b(obj);
                MutableSharedFlow<VideoCallCodeCheckViewModel.Error> k02 = this.f51842b.k0();
                C0696a c0696a = new C0696a(this.f51843c, this.f51844d);
                this.f51841a = 1;
                if (k02.collect(c0696a, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            throw new KotlinNothingValueException();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: VideoCallCodeCheckScreen.kt */
    /* loaded from: classes5.dex */
    public static final class b extends w implements q<r0.h, androidx.compose.runtime.a, Integer, y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f51847a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f51848b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ym0.l<String, y> f51849c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ ym0.a<y> f51850d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(String str, String str2, ym0.l<? super String, y> lVar, ym0.a<y> aVar) {
            super(3);
            this.f51847a = str;
            this.f51848b = str2;
            this.f51849c = lVar;
            this.f51850d = aVar;
        }

        @Override // ym0.q
        public final y invoke(r0.h hVar, androidx.compose.runtime.a aVar, Integer num) {
            androidx.compose.ui.text.b bVar;
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
                InputFieldType inputFieldType = InputFieldType.f33879g;
                String u11 = ay.b.u(C1987R.string.login_2FA_code_entry, aVar2);
                String str = this.f51847a;
                if (str == null) {
                    str = "";
                }
                String str2 = str;
                String str3 = this.f51848b;
                if (str3 != null) {
                    bVar = new androidx.compose.ui.text.b(str3, null, 6);
                } else {
                    bVar = null;
                }
                if (str3 != null) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                fk.q.b(null, inputFieldType, null, u11, str2, bVar, ay.b.u(C1987R.string.login_2FA_code_placeholde, aVar2), null, null, null, null, z5, null, null, 7, null, false, new com.withings.wiscale2.device.common.feature.ecg.us.hwa10.ui.call.c(k4Var, this.f51850d, a12), this.f51849c, aVar2, 48, 24576, 112517);
            }
            return y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: VideoCallCodeCheckScreen.kt */
    /* loaded from: classes5.dex */
    public static final class c extends w implements p<androidx.compose.runtime.a, Integer, y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ym0.a<y> f51851a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f51852b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f51853c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ ym0.l<String, y> f51854d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ String f51855e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ boolean f51856f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ boolean f51857g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ ym0.a<y> f51858h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ ym0.a<y> f51859i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ int f51860j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(ym0.a<y> aVar, String str, String str2, ym0.l<? super String, y> lVar, String str3, boolean z5, boolean z11, ym0.a<y> aVar2, ym0.a<y> aVar3, int i11) {
            super(2);
            this.f51851a = aVar;
            this.f51852b = str;
            this.f51853c = str2;
            this.f51854d = lVar;
            this.f51855e = str3;
            this.f51856f = z5;
            this.f51857g = z11;
            this.f51858h = aVar2;
            this.f51859i = aVar3;
            this.f51860j = i11;
        }

        @Override // ym0.p
        public final y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = o.g(this.f51860j | 1);
            ym0.a<y> aVar2 = this.f51858h;
            ym0.a<y> aVar3 = this.f51859i;
            a.b(this.f51851a, this.f51852b, this.f51853c, this.f51854d, this.f51855e, this.f51856f, this.f51857g, aVar2, aVar3, aVar, g11);
            return y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: VideoCallCodeCheckScreen.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.device.common.feature.ecg.us.hwa10.ui.call.VideoCallCodeCheckScreenKt$VideoCallCodeCheckScreen$2", f = "VideoCallCodeCheckScreen.kt", l = {99}, m = "invokeSuspend")
    /* loaded from: classes5.dex */
    public static final class d extends kotlin.coroutines.jvm.internal.i implements p<CoroutineScope, qm0.d<? super y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f51861a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ VideoCallCodeCheckViewModel f51862b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ym0.a<y> f51863c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: VideoCallCodeCheckScreen.kt */
        /* renamed from: com.withings.wiscale2.device.common.feature.ecg.us.hwa10.ui.call.a$d$a  reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        public static final class C0697a<T> implements FlowCollector {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ ym0.a<y> f51864a;

            C0697a(ym0.a<y> aVar) {
                this.f51864a = aVar;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public final Object emit(Object obj, qm0.d dVar) {
                y yVar = (y) obj;
                this.f51864a.invoke();
                return y.f85009a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(VideoCallCodeCheckViewModel videoCallCodeCheckViewModel, ym0.a<y> aVar, qm0.d<? super d> dVar) {
            super(2, dVar);
            this.f51862b = videoCallCodeCheckViewModel;
            this.f51863c = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
            return new d(this.f51862b, this.f51863c, dVar);
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super y> dVar) {
            ((d) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
            return CoroutineSingletons.f76214a;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            int i11 = this.f51861a;
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                nm0.l.b(obj);
            } else {
                nm0.l.b(obj);
                MutableSharedFlow<y> m02 = this.f51862b.m0();
                C0697a c0697a = new C0697a(this.f51863c);
                this.f51861a = 1;
                if (m02.collect(c0697a, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            throw new KotlinNothingValueException();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: VideoCallCodeCheckScreen.kt */
    /* loaded from: classes5.dex */
    public static final class e extends w implements ym0.l<String, y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ r0<Boolean> f51865a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ VideoCallCodeCheckViewModel f51866b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(r0<Boolean> r0Var, VideoCallCodeCheckViewModel videoCallCodeCheckViewModel) {
            super(1);
            this.f51865a = r0Var;
            this.f51866b = videoCallCodeCheckViewModel;
        }

        @Override // ym0.l
        public final y invoke(String str) {
            String it = str;
            u.j(it, "it");
            this.f51865a.setValue(Boolean.FALSE);
            this.f51866b.r0().setValue(it);
            return y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: VideoCallCodeCheckScreen.kt */
    /* loaded from: classes5.dex */
    public /* synthetic */ class f extends s implements ym0.a<y> {
        f(Object obj) {
            super(0, obj, VideoCallCodeCheckViewModel.class, "checkCode", "checkCode()V", 0);
        }

        @Override // ym0.a
        public final /* bridge */ /* synthetic */ y invoke() {
            m();
            return y.f85009a;
        }

        public final void m() {
            VideoCallCodeCheckViewModel videoCallCodeCheckViewModel = (VideoCallCodeCheckViewModel) this.receiver;
            videoCallCodeCheckViewModel.getClass();
            BuildersKt__Builders_commonKt.launch$default(h1.a(videoCallCodeCheckViewModel), Dispatchers.getIO(), null, new com.withings.wiscale2.device.common.feature.ecg.us.hwa10.ui.call.d(videoCallCodeCheckViewModel, null), 2, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: VideoCallCodeCheckScreen.kt */
    /* loaded from: classes5.dex */
    public /* synthetic */ class g extends s implements ym0.a<y> {
        g(Object obj) {
            super(0, obj, VideoCallCodeCheckViewModel.class, "resendCode", "resendCode()V", 0);
        }

        @Override // ym0.a
        public final /* bridge */ /* synthetic */ y invoke() {
            m();
            return y.f85009a;
        }

        public final void m() {
            VideoCallCodeCheckViewModel videoCallCodeCheckViewModel = (VideoCallCodeCheckViewModel) this.receiver;
            videoCallCodeCheckViewModel.getClass();
            BuildersKt__Builders_commonKt.launch$default(h1.a(videoCallCodeCheckViewModel), Dispatchers.getIO(), null, new com.withings.wiscale2.device.common.feature.ecg.us.hwa10.ui.call.e(videoCallCodeCheckViewModel, null), 2, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: VideoCallCodeCheckScreen.kt */
    /* loaded from: classes5.dex */
    public static final class h extends w implements p<androidx.compose.runtime.a, Integer, y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ VideoCallCodeCheckViewModel f51867a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ym0.a<y> f51868b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ym0.a<y> f51869c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ ym0.a<y> f51870d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ int f51871e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(VideoCallCodeCheckViewModel videoCallCodeCheckViewModel, ym0.a<y> aVar, ym0.a<y> aVar2, ym0.a<y> aVar3, int i11) {
            super(2);
            this.f51867a = videoCallCodeCheckViewModel;
            this.f51868b = aVar;
            this.f51869c = aVar2;
            this.f51870d = aVar3;
            this.f51871e = i11;
        }

        @Override // ym0.p
        public final y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = o.g(this.f51871e | 1);
            ym0.a<y> aVar2 = this.f51869c;
            ym0.a<y> aVar3 = this.f51870d;
            a.a(this.f51867a, this.f51868b, aVar2, aVar3, aVar, g11);
            return y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: VideoCallCodeCheckScreen.kt */
    /* loaded from: classes5.dex */
    public static final class i extends w implements p<androidx.compose.runtime.a, Integer, y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f51872a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(String str) {
            super(2);
            this.f51872a = str;
        }

        @Override // ym0.p
        public final y invoke(androidx.compose.runtime.a aVar, Integer num) {
            androidx.compose.runtime.a aVar2 = aVar;
            if ((num.intValue() & 11) == 2 && aVar2.h()) {
                aVar2.C();
            } else {
                PhoneNumberUtil i11 = PhoneNumberUtil.i();
                String d11 = i11.d(i11.z(this.f51872a, Locale.US.getCountry()), PhoneNumberUtil.PhoneNumberFormat.f27150c);
                String u11 = ay.b.u(C1987R.string.hwa10Rx_usOnboarding_codeCheck_title, aVar2);
                u.g(d11);
                v4.b(null, u11, ay.b.v(C1987R.string.hwa10Rx_usOnboarding_codeCheck_paragraph, new Object[]{d11}, aVar2), null, 0.0f, 0.0f, 0, 0, aVar2, 0, ConstantsWs.WS_STATUS_WRONG_DATE_FORMAT);
            }
            return y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: VideoCallCodeCheckScreen.kt */
    /* loaded from: classes5.dex */
    public static final class j extends w implements p<androidx.compose.runtime.a, Integer, y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f51873a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f51874b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f51875c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ ym0.a<y> f51876d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(String str, boolean z5, boolean z11, ym0.a<y> aVar) {
            super(2);
            this.f51873a = str;
            this.f51874b = z5;
            this.f51875c = z11;
            this.f51876d = aVar;
        }

        @Override // ym0.p
        public final y invoke(androidx.compose.runtime.a aVar, Integer num) {
            boolean z5;
            androidx.compose.runtime.a aVar2 = aVar;
            if ((num.intValue() & 11) == 2 && aVar2.h()) {
                aVar2.C();
            } else {
                String u11 = ay.b.u(C1987R.string._NEXT_, aVar2);
                String str = this.f51873a;
                if (str == null) {
                    str = "";
                }
                if ((!dp0.j.D(str)) && !this.f51874b) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                com.withings.common.compose.component.l.a(null, u11, null, z5, null, null, this.f51875c, this.f51876d, aVar2, 0, 53);
            }
            return y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: VideoCallCodeCheckScreen.kt */
    /* loaded from: classes5.dex */
    public static final class k extends w implements p<androidx.compose.runtime.a, Integer, y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ boolean f51877a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f51878b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ym0.a<y> f51879c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(boolean z5, boolean z11, ym0.a<y> aVar) {
            super(2);
            this.f51877a = z5;
            this.f51878b = z11;
            this.f51879c = aVar;
        }

        @Override // ym0.p
        public final y invoke(androidx.compose.runtime.a aVar, Integer num) {
            androidx.compose.runtime.a aVar2 = aVar;
            if ((num.intValue() & 11) == 2 && aVar2.h()) {
                aVar2.C();
            } else {
                com.withings.common.compose.component.l.c(null, ay.b.u(C1987R.string.login_2FA_code_sendAgain, aVar2), null, !this.f51877a, null, null, this.f51878b, this.f51879c, aVar2, 0, 53);
            }
            return y.f85009a;
        }
    }

    public static final void a(VideoCallCodeCheckViewModel viewModel, ym0.a<y> navigateUp, ym0.a<y> navigateToError, ym0.a<y> next, androidx.compose.runtime.a aVar, int i11) {
        u.j(viewModel, "viewModel");
        u.j(navigateUp, "navigateUp");
        u.j(navigateToError, "navigateToError");
        u.j(next, "next");
        androidx.compose.runtime.b g11 = aVar.g(-193236915);
        r0 b10 = l0.b(viewModel.r0(), g11);
        g11.s(-541196862);
        Object t11 = g11.t();
        if (t11 == a.C0060a.a()) {
            t11 = l0.f(Boolean.FALSE, v0.f8878a);
            g11.n(t11);
        }
        r0 r0Var = (r0) t11;
        g11.J();
        r0 b11 = l0.b(viewModel.t0(), g11);
        r0 b12 = l0.b(viewModel.y0(), g11);
        String str = null;
        k1.y.f("codeCheckErrorEvent", new C0695a(viewModel, r0Var, navigateToError, null), g11);
        k1.y.f("codeCheckSuccessEvent", new d(viewModel, next, null), g11);
        String q02 = viewModel.q0();
        String str2 = (String) b10.getValue();
        e eVar = new e(r0Var, viewModel);
        g11.s(-541195873);
        if (((Boolean) r0Var.getValue()).booleanValue()) {
            str = ay.b.u(C1987R.string.hwa09_usOnboarding_error_confirmationCode_message, g11);
        }
        g11.J();
        b(navigateUp, q02, str2, eVar, str, ((Boolean) b11.getValue()).booleanValue(), ((Boolean) b12.getValue()).booleanValue(), new f(viewModel), new g(viewModel), g11, (i11 >> 3) & 14);
        v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new h(viewModel, navigateUp, navigateToError, next, i11));
        }
    }

    public static final void b(ym0.a<y> onBackClicked, String phoneNumber, String str, ym0.l<? super String, y> onSmsCodeChanged, String str2, boolean z5, boolean z11, ym0.a<y> onCodeConfirmationClicked, ym0.a<y> onNeedToSendCodeAgainClicked, androidx.compose.runtime.a aVar, int i11) {
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
        u.j(phoneNumber, "phoneNumber");
        u.j(onSmsCodeChanged, "onSmsCodeChanged");
        u.j(onCodeConfirmationClicked, "onCodeConfirmationClicked");
        u.j(onNeedToSendCodeAgainClicked, "onNeedToSendCodeAgainClicked");
        androidx.compose.runtime.b g11 = aVar.g(-1325030765);
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
            if (g11.K(phoneNumber)) {
                i21 = 32;
            } else {
                i21 = 16;
            }
            i12 |= i21;
        }
        if ((i11 & ConstantsWs.HWFAILURE_ZERO) == 0) {
            if (g11.K(str)) {
                i19 = 256;
            } else {
                i19 = 128;
            }
            i12 |= i19;
        }
        if ((i11 & 7168) == 0) {
            if (g11.w(onSmsCodeChanged)) {
                i18 = ModuleCopy.f28574b;
            } else {
                i18 = 1024;
            }
            i12 |= i18;
        }
        if ((57344 & i11) == 0) {
            if (g11.K(str2)) {
                i17 = Http2.INITIAL_MAX_FRAME_SIZE;
            } else {
                i17 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
            }
            i12 |= i17;
        }
        if ((458752 & i11) == 0) {
            if (g11.a(z5)) {
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
            if (g11.w(onCodeConfirmationClicked)) {
                i14 = 8388608;
            } else {
                i14 = 4194304;
            }
            i12 |= i14;
        }
        if ((234881024 & i11) == 0) {
            if (g11.w(onNeedToSendCodeAgainClicked)) {
                i13 = 67108864;
            } else {
                i13 = 33554432;
            }
            i12 |= i13;
        }
        if ((191739611 & i12) == 38347922 && g11.h()) {
            g11.C();
            bVar = g11;
        } else {
            s1.a b10 = s1.b.b(g11, -144616097, new i(phoneNumber));
            s1.a b11 = s1.b.b(g11, -1524401410, new j(str, z11, z5, onCodeConfirmationClicked));
            s1.a b12 = s1.b.b(g11, 1390780573, new k(z5, z11, onNeedToSendCodeAgainClicked));
            float o11 = yk.h.o();
            float q11 = yk.h.q();
            bVar = g11;
            c0.b(null, null, null, onBackClicked, null, b10, b11, b12, 0L, false, new x(o11, q11, o11, q11), null, 0.0f, false, s1.b.b(g11, -349234087, new b(str, str2, onSmsCodeChanged, onCodeConfirmationClicked)), bVar, ((i12 << 9) & 7168) | 14352384, 24576, 15127);
        }
        v o02 = bVar.o0();
        if (o02 != null) {
            o02.G(new c(onBackClicked, phoneNumber, str, onSmsCodeChanged, str2, z5, z11, onCodeConfirmationClicked, onNeedToSendCodeAgainClicked, i11));
        }
    }
}
