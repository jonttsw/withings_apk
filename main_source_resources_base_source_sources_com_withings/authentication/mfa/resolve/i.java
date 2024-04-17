package com.withings.authentication.mfa.resolve;

import android.content.Context;
import androidx.compose.material.w7;
import androidx.compose.material3.y7;
import androidx.compose.runtime.a;
import androidx.lifecycle.h1;
import com.google.i18n.phonenumbers.PhoneNumberUtil;
import com.withings.authentication.mfa.resolve.a;
import com.withings.authentication.mfa.resolve.b;
import com.withings.authentication.mfa.resolve.c;
import com.withings.authentication.mfa.resolve.o0;
import com.withings.authentication.mfa.resolve.p0;
import com.withings.common.compose.component.ToastStyle;
import com.withings.common.compose.component.c5;
import com.withings.common.compose.component.z4;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.wiscale2.C1987R;
import java.util.ArrayList;
import java.util.List;
import k1.o1;
import k1.r0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
/* compiled from: MfaResolveScreen.kt */
/* loaded from: classes3.dex */
public final class i {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MfaResolveScreen.kt */
    /* loaded from: classes3.dex */
    public static final class a extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f32081a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(ym0.a<nm0.y> aVar) {
            super(2);
            this.f32081a = aVar;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            androidx.compose.runtime.a aVar2 = aVar;
            if ((num.intValue() & 11) == 2 && aVar2.h()) {
                aVar2.C();
            } else {
                h2.d a11 = f1.b.a();
                ym0.a<nm0.y> aVar3 = this.f32081a;
                if (aVar3 == null) {
                    a11 = null;
                }
                h2.d dVar = a11;
                aVar2.s(1154575152);
                boolean K = aVar2.K(aVar3);
                Object t11 = aVar2.t();
                if (K || t11 == a.C0060a.a()) {
                    t11 = new com.withings.authentication.mfa.resolve.h(aVar3);
                    aVar2.n(t11);
                }
                aVar2.J();
                c5.a(0L, 0L, null, false, dVar, null, null, null, false, (ym0.a) t11, aVar2, 0, 495);
            }
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MfaResolveScreen.kt */
    /* loaded from: classes3.dex */
    public static final class b extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f32082a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f32083b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(ym0.a<nm0.y> aVar, int i11) {
            super(2);
            this.f32082a = aVar;
            this.f32083b = i11;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = ah.o.g(this.f32083b | 1);
            i.a(this.f32082a, aVar, g11);
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MfaResolveScreen.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.authentication.mfa.resolve.MfaResolveScreenKt$MfaResolveScreen$1", f = "MfaResolveScreen.kt", l = {90}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    public static final class c extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f32084a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ MfaResolutionViewModel f32085b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ z4 f32086c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ Context f32087d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f32088e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ CoroutineScope f32089f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ r0<com.withings.authentication.mfa.resolve.b> f32090g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ androidx.compose.material.c5 f32091h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ r0<Boolean> f32092i;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: MfaResolveScreen.kt */
        @kotlin.coroutines.jvm.internal.e(c = "com.withings.authentication.mfa.resolve.MfaResolveScreenKt$MfaResolveScreen$1$1", f = "MfaResolveScreen.kt", l = {93, 101, 112, 116}, m = "invokeSuspend")
        /* loaded from: classes3.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.i implements ym0.p<p0, qm0.d<? super nm0.y>, Object> {

            /* renamed from: a  reason: collision with root package name */
            int f32093a;

            /* renamed from: b  reason: collision with root package name */
            /* synthetic */ Object f32094b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ z4 f32095c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ Context f32096d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ ym0.a<nm0.y> f32097e;

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ CoroutineScope f32098f;

            /* renamed from: g  reason: collision with root package name */
            final /* synthetic */ r0<com.withings.authentication.mfa.resolve.b> f32099g;

            /* renamed from: h  reason: collision with root package name */
            final /* synthetic */ androidx.compose.material.c5 f32100h;

            /* renamed from: i  reason: collision with root package name */
            final /* synthetic */ r0<Boolean> f32101i;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: MfaResolveScreen.kt */
            @kotlin.coroutines.jvm.internal.e(c = "com.withings.authentication.mfa.resolve.MfaResolveScreenKt$MfaResolveScreen$1$1$1", f = "MfaResolveScreen.kt", l = {109}, m = "invokeSuspend")
            /* renamed from: com.withings.authentication.mfa.resolve.i$c$a$a  reason: collision with other inner class name */
            /* loaded from: classes3.dex */
            public static final class C0426a extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

                /* renamed from: a  reason: collision with root package name */
                int f32102a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ androidx.compose.material.c5 f32103b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0426a(androidx.compose.material.c5 c5Var, qm0.d<? super C0426a> dVar) {
                    super(2, dVar);
                    this.f32103b = c5Var;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
                    return new C0426a(this.f32103b, dVar);
                }

                @Override // ym0.p
                public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
                    return ((C0426a) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
                    int i11 = this.f32102a;
                    if (i11 != 0) {
                        if (i11 == 1) {
                            nm0.l.b(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        nm0.l.b(obj);
                        this.f32102a = 1;
                        if (this.f32103b.l(this) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                    return nm0.y.f85009a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(z4 z4Var, Context context, ym0.a<nm0.y> aVar, CoroutineScope coroutineScope, r0<com.withings.authentication.mfa.resolve.b> r0Var, androidx.compose.material.c5 c5Var, r0<Boolean> r0Var2, qm0.d<? super a> dVar) {
                super(2, dVar);
                this.f32095c = z4Var;
                this.f32096d = context;
                this.f32097e = aVar;
                this.f32098f = coroutineScope;
                this.f32099g = r0Var;
                this.f32100h = c5Var;
                this.f32101i = r0Var2;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
                a aVar = new a(this.f32095c, this.f32096d, this.f32097e, this.f32098f, this.f32099g, this.f32100h, this.f32101i, dVar);
                aVar.f32094b = obj;
                return aVar;
            }

            @Override // ym0.p
            public final Object invoke(p0 p0Var, qm0.d<? super nm0.y> dVar) {
                return ((a) create(p0Var, dVar)).invokeSuspend(nm0.y.f85009a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
                int i11 = this.f32093a;
                r0<Boolean> r0Var = this.f32101i;
                if (i11 != 0) {
                    if (i11 != 1) {
                        if (i11 != 2) {
                            if (i11 != 3) {
                                if (i11 != 4) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                            } else {
                                nm0.l.b(obj);
                                r0Var.setValue(Boolean.FALSE);
                            }
                        }
                        nm0.l.b(obj);
                    } else {
                        nm0.l.b(obj);
                        this.f32097e.invoke();
                    }
                } else {
                    nm0.l.b(obj);
                    p0 p0Var = (p0) this.f32094b;
                    boolean e11 = kotlin.jvm.internal.u.e(p0Var, p0.a.f32189a);
                    Context context = this.f32096d;
                    if (e11) {
                        ToastStyle toastStyle = ToastStyle.f33348a;
                        String string = context.getString(C1987R.string.mfa_setup_confirmationCodeToast_successStatus);
                        kotlin.jvm.internal.u.i(string, "getString(...)");
                        this.f32093a = 1;
                        if (z4.c(this.f32095c, toastStyle, string, null, 1000L, null, this, 20) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        this.f32097e.invoke();
                    } else if (kotlin.jvm.internal.u.e(p0Var, kh.d.f75947a)) {
                        ToastStyle toastStyle2 = ToastStyle.f33350c;
                        String string2 = context.getString(C1987R.string.mfa_setup_confirmationCodeToast_failureStatus);
                        kotlin.jvm.internal.u.i(string2, "getString(...)");
                        this.f32093a = 2;
                        if (z4.c(this.f32095c, toastStyle2, string2, null, 0L, null, this, 28) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else if (p0Var instanceof kh.c) {
                        kh.c cVar = (kh.c) p0Var;
                        this.f32099g.setValue(new b.C0423b(cVar.a()));
                        BuildersKt__Builders_commonKt.launch$default(this.f32098f, null, null, new C0426a(this.f32100h, null), 3, null);
                        r0Var.setValue(Boolean.TRUE);
                        long j5 = ep0.c.j(cVar.a(), DurationUnit.f78024d);
                        this.f32093a = 3;
                        if (DelayKt.m58delayVtjQ1oo(j5, this) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        r0Var.setValue(Boolean.FALSE);
                    } else if (kotlin.jvm.internal.u.e(p0Var, kh.b.f75945a)) {
                        ToastStyle toastStyle3 = ToastStyle.f33350c;
                        String string3 = context.getString(C1987R.string._ERROR_);
                        kotlin.jvm.internal.u.i(string3, "getString(...)");
                        this.f32093a = 4;
                        if (z4.c(this.f32095c, toastStyle3, string3, null, 0L, null, this, 28) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                }
                return nm0.y.f85009a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(MfaResolutionViewModel mfaResolutionViewModel, z4 z4Var, Context context, ym0.a<nm0.y> aVar, CoroutineScope coroutineScope, r0<com.withings.authentication.mfa.resolve.b> r0Var, androidx.compose.material.c5 c5Var, r0<Boolean> r0Var2, qm0.d<? super c> dVar) {
            super(2, dVar);
            this.f32085b = mfaResolutionViewModel;
            this.f32086c = z4Var;
            this.f32087d = context;
            this.f32088e = aVar;
            this.f32089f = coroutineScope;
            this.f32090g = r0Var;
            this.f32091h = c5Var;
            this.f32092i = r0Var2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
            return new c(this.f32085b, this.f32086c, this.f32087d, this.f32088e, this.f32089f, this.f32090g, this.f32091h, this.f32092i, dVar);
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
            return ((c) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            int i11 = this.f32084a;
            if (i11 != 0) {
                if (i11 == 1) {
                    nm0.l.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                nm0.l.b(obj);
                SharedFlow<p0> O0 = this.f32085b.O0();
                a aVar = new a(this.f32086c, this.f32087d, this.f32088e, this.f32089f, this.f32090g, this.f32091h, this.f32092i, null);
                this.f32084a = 1;
                if (FlowKt.collectLatest(O0, aVar, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MfaResolveScreen.kt */
    /* loaded from: classes3.dex */
    public static final class d extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ MfaResolutionViewModel f32104a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f32105b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f32106c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f32107d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f32108e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ int f32109f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ int f32110g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(MfaResolutionViewModel mfaResolutionViewModel, ym0.a<nm0.y> aVar, ym0.a<nm0.y> aVar2, ym0.a<nm0.y> aVar3, ym0.a<nm0.y> aVar4, int i11, int i12) {
            super(2);
            this.f32104a = mfaResolutionViewModel;
            this.f32105b = aVar;
            this.f32106c = aVar2;
            this.f32107d = aVar3;
            this.f32108e = aVar4;
            this.f32109f = i11;
            this.f32110g = i12;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = ah.o.g(this.f32109f | 1);
            ym0.a<nm0.y> aVar2 = this.f32107d;
            ym0.a<nm0.y> aVar3 = this.f32108e;
            i.b(this.f32104a, this.f32105b, this.f32106c, aVar2, aVar3, aVar, g11, this.f32110g);
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MfaResolveScreen.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.authentication.mfa.resolve.MfaResolveScreenKt$MfaResolveScreen$2", f = "MfaResolveScreen.kt", l = {125}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    public static final class e extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f32111a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ MfaResolutionViewModel f32112b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ z4 f32113c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ Context f32114d;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: MfaResolveScreen.kt */
        @kotlin.coroutines.jvm.internal.e(c = "com.withings.authentication.mfa.resolve.MfaResolveScreenKt$MfaResolveScreen$2$1", f = "MfaResolveScreen.kt", l = {127, ConstantsWs.MEASURE_TYPE_VHD_RESULT}, m = "invokeSuspend")
        /* loaded from: classes3.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.i implements ym0.p<o0, qm0.d<? super nm0.y>, Object> {

            /* renamed from: a  reason: collision with root package name */
            int f32115a;

            /* renamed from: b  reason: collision with root package name */
            /* synthetic */ Object f32116b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ z4 f32117c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ Context f32118d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(z4 z4Var, Context context, qm0.d<? super a> dVar) {
                super(2, dVar);
                this.f32117c = z4Var;
                this.f32118d = context;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
                a aVar = new a(this.f32117c, this.f32118d, dVar);
                aVar.f32116b = obj;
                return aVar;
            }

            @Override // ym0.p
            public final Object invoke(o0 o0Var, qm0.d<? super nm0.y> dVar) {
                return ((a) create(o0Var, dVar)).invokeSuspend(nm0.y.f85009a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
                int i11 = this.f32115a;
                if (i11 != 0) {
                    if (i11 != 1 && i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    nm0.l.b(obj);
                } else {
                    nm0.l.b(obj);
                    o0 o0Var = (o0) this.f32116b;
                    boolean e11 = kotlin.jvm.internal.u.e(o0Var, o0.b.f32185a);
                    Context context = this.f32118d;
                    if (e11) {
                        ToastStyle toastStyle = ToastStyle.f33351d;
                        String string = context.getString(C1987R.string._2FA_again_status);
                        kotlin.jvm.internal.u.i(string, "getString(...)");
                        this.f32115a = 1;
                        if (z4.c(this.f32117c, toastStyle, string, null, 0L, null, this, 28) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else if (kotlin.jvm.internal.u.e(o0Var, o0.a.f32184a)) {
                        ToastStyle toastStyle2 = ToastStyle.f33350c;
                        String string2 = context.getString(C1987R.string.mfa_setup_confirmationCodeToast_failureStatus_expired);
                        kotlin.jvm.internal.u.i(string2, "getString(...)");
                        this.f32115a = 2;
                        if (z4.c(this.f32117c, toastStyle2, string2, null, 0L, null, this, 28) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                }
                return nm0.y.f85009a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(MfaResolutionViewModel mfaResolutionViewModel, z4 z4Var, Context context, qm0.d<? super e> dVar) {
            super(2, dVar);
            this.f32112b = mfaResolutionViewModel;
            this.f32113c = z4Var;
            this.f32114d = context;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
            return new e(this.f32112b, this.f32113c, this.f32114d, dVar);
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
            return ((e) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            int i11 = this.f32111a;
            if (i11 != 0) {
                if (i11 == 1) {
                    nm0.l.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                nm0.l.b(obj);
                SharedFlow<o0> G0 = this.f32112b.G0();
                a aVar = new a(this.f32113c, this.f32114d, null);
                this.f32111a = 1;
                if (FlowKt.collectLatest(G0, aVar, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MfaResolveScreen.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.authentication.mfa.resolve.MfaResolveScreenKt$MfaResolveScreen$3", f = "MfaResolveScreen.kt", l = {ConstantsWs.MEASURE_TYPE_PPG_AFIB_RESULT}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    public static final class f extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f32119a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ MfaResolutionViewModel f32120b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f32121c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ z4 f32122d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ Context f32123e;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: MfaResolveScreen.kt */
        @kotlin.coroutines.jvm.internal.e(c = "com.withings.authentication.mfa.resolve.MfaResolveScreenKt$MfaResolveScreen$3$1", f = "MfaResolveScreen.kt", l = {ConstantsWs.MEASURE_TYPE_HR_LEVEL_MIN}, m = "invokeSuspend")
        /* loaded from: classes3.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.i implements ym0.p<Boolean, qm0.d<? super nm0.y>, Object> {

            /* renamed from: a  reason: collision with root package name */
            int f32124a;

            /* renamed from: b  reason: collision with root package name */
            /* synthetic */ boolean f32125b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ ym0.a<nm0.y> f32126c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ z4 f32127d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ Context f32128e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(ym0.a<nm0.y> aVar, z4 z4Var, Context context, qm0.d<? super a> dVar) {
                super(2, dVar);
                this.f32126c = aVar;
                this.f32127d = z4Var;
                this.f32128e = context;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
                a aVar = new a(this.f32126c, this.f32127d, this.f32128e, dVar);
                aVar.f32125b = ((Boolean) obj).booleanValue();
                return aVar;
            }

            @Override // ym0.p
            public final Object invoke(Boolean bool, qm0.d<? super nm0.y> dVar) {
                Boolean bool2 = bool;
                bool2.booleanValue();
                return ((a) create(bool2, dVar)).invokeSuspend(nm0.y.f85009a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
                int i11 = this.f32124a;
                if (i11 != 0) {
                    if (i11 == 1) {
                        nm0.l.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    nm0.l.b(obj);
                    if (this.f32125b) {
                        ym0.a<nm0.y> aVar = this.f32126c;
                        if (aVar != null) {
                            aVar.invoke();
                        }
                    } else {
                        ToastStyle toastStyle = ToastStyle.f33350c;
                        String string = this.f32128e.getString(C1987R.string._ERROR_);
                        kotlin.jvm.internal.u.i(string, "getString(...)");
                        this.f32124a = 1;
                        if (z4.c(this.f32127d, toastStyle, string, null, 0L, null, this, 28) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                }
                return nm0.y.f85009a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(MfaResolutionViewModel mfaResolutionViewModel, ym0.a<nm0.y> aVar, z4 z4Var, Context context, qm0.d<? super f> dVar) {
            super(2, dVar);
            this.f32120b = mfaResolutionViewModel;
            this.f32121c = aVar;
            this.f32122d = z4Var;
            this.f32123e = context;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
            return new f(this.f32120b, this.f32121c, this.f32122d, this.f32123e, dVar);
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
            return ((f) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            int i11 = this.f32119a;
            if (i11 != 0) {
                if (i11 == 1) {
                    nm0.l.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                nm0.l.b(obj);
                SharedFlow<Boolean> F0 = this.f32120b.F0();
                a aVar = new a(this.f32121c, this.f32122d, this.f32123e, null);
                this.f32119a = 1;
                if (FlowKt.collectLatest(F0, aVar, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MfaResolveScreen.kt */
    /* loaded from: classes3.dex */
    public static final class g extends kotlin.jvm.internal.w implements ym0.a<nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ r0<Boolean> f32129a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(r0<Boolean> r0Var) {
            super(0);
            this.f32129a = r0Var;
        }

        @Override // ym0.a
        public final nm0.y invoke() {
            this.f32129a.setValue(Boolean.FALSE);
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MfaResolveScreen.kt */
    /* loaded from: classes3.dex */
    public static final class h extends kotlin.jvm.internal.w implements ym0.a<nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ MfaResolutionViewModel f32130a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Context f32131b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ r0<Boolean> f32132c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(MfaResolutionViewModel mfaResolutionViewModel, Context context, r0<Boolean> r0Var) {
            super(0);
            this.f32130a = mfaResolutionViewModel;
            this.f32131b = context;
            this.f32132c = r0Var;
        }

        @Override // ym0.a
        public final nm0.y invoke() {
            this.f32132c.setValue(Boolean.FALSE);
            MfaResolutionViewModel mfaResolutionViewModel = this.f32130a;
            mfaResolutionViewModel.getClass();
            Context context = this.f32131b;
            kotlin.jvm.internal.u.j(context, "context");
            BuildersKt__Builders_commonKt.launch$default(h1.a(mfaResolutionViewModel), Dispatchers.getIO(), null, new com.withings.authentication.mfa.resolve.e(mfaResolutionViewModel, context, null), 2, null);
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MfaResolveScreen.kt */
    /* renamed from: com.withings.authentication.mfa.resolve.i$i  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static final class C0427i extends kotlin.jvm.internal.w implements ym0.a<nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ r0<Boolean> f32133a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0427i(r0<Boolean> r0Var) {
            super(0);
            this.f32133a = r0Var;
        }

        @Override // ym0.a
        public final nm0.y invoke() {
            this.f32133a.setValue(Boolean.FALSE);
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MfaResolveScreen.kt */
    /* loaded from: classes3.dex */
    public static final class j extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a.c f32134a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f32135b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ r0<com.withings.authentication.mfa.resolve.b> f32136c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ o1<Boolean> f32137d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ CoroutineScope f32138e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ MfaResolutionViewModel f32139f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ androidx.compose.material.c5 f32140g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f32141h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ r0<Boolean> f32142i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(a.c cVar, ym0.a aVar, r0 r0Var, r0 r0Var2, CoroutineScope coroutineScope, MfaResolutionViewModel mfaResolutionViewModel, androidx.compose.material.c5 c5Var, ym0.a aVar2, r0 r0Var3) {
            super(2);
            this.f32134a = cVar;
            this.f32135b = aVar;
            this.f32136c = r0Var;
            this.f32137d = r0Var2;
            this.f32138e = coroutineScope;
            this.f32139f = mfaResolutionViewModel;
            this.f32140g = c5Var;
            this.f32141h = aVar2;
            this.f32142i = r0Var3;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            ym0.a aVar2;
            androidx.compose.runtime.a aVar3 = aVar;
            if ((num.intValue() & 11) == 2 && aVar3.h()) {
                aVar3.C();
            } else {
                r0<com.withings.authentication.mfa.resolve.b> r0Var = this.f32136c;
                com.withings.authentication.mfa.resolve.b value = r0Var.getValue();
                List<com.withings.authentication.mfa.resolve.c> b10 = this.f32134a.b();
                boolean booleanValue = this.f32137d.getValue().booleanValue();
                CoroutineScope coroutineScope = this.f32138e;
                MfaResolutionViewModel mfaResolutionViewModel = this.f32139f;
                androidx.compose.material.c5 c5Var = this.f32140g;
                com.withings.authentication.mfa.resolve.k kVar = new com.withings.authentication.mfa.resolve.k(coroutineScope, mfaResolutionViewModel, c5Var, r0Var);
                m mVar = new m(coroutineScope, this.f32141h, c5Var, r0Var);
                aVar3.s(-1516055079);
                if (this.f32135b != null) {
                    aVar3.s(-1516055027);
                    Object t11 = aVar3.t();
                    if (t11 == a.C0060a.a()) {
                        t11 = new n(this.f32142i);
                        aVar3.n(t11);
                    }
                    aVar2 = (ym0.a) t11;
                    aVar3.J();
                } else {
                    aVar2 = null;
                }
                aVar3.J();
                i.c(value, b10, booleanValue, kVar, mVar, aVar2, new p(c5Var, r0Var, coroutineScope), aVar3, 64);
            }
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MfaResolveScreen.kt */
    /* loaded from: classes3.dex */
    public static final class k extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a.c f32143a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ z4 f32144b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f32145c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ r0<Boolean> f32146d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ r0<Boolean> f32147e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ o1<Boolean> f32148f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ Context f32149g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ String f32150h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ CoroutineScope f32151i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ r0<com.withings.authentication.mfa.resolve.b> f32152j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ androidx.compose.material.c5 f32153k;

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ MfaResolutionViewModel f32154l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(a.c cVar, z4 z4Var, ym0.a aVar, r0 r0Var, r0 r0Var2, r0 r0Var3, Context context, String str, CoroutineScope coroutineScope, r0 r0Var4, androidx.compose.material.c5 c5Var, MfaResolutionViewModel mfaResolutionViewModel) {
            super(2);
            this.f32143a = cVar;
            this.f32144b = z4Var;
            this.f32145c = aVar;
            this.f32146d = r0Var;
            this.f32147e = r0Var2;
            this.f32148f = r0Var3;
            this.f32149g = context;
            this.f32150h = str;
            this.f32151i = coroutineScope;
            this.f32152j = r0Var4;
            this.f32153k = c5Var;
            this.f32154l = mfaResolutionViewModel;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            androidx.compose.runtime.a aVar2 = aVar;
            if ((num.intValue() & 11) == 2 && aVar2.h()) {
                aVar2.C();
            } else {
                com.withings.authentication.mfa.resolve.c c11 = this.f32143a.c();
                boolean e11 = kotlin.jvm.internal.u.e(c11, c.C0424c.f31965a);
                androidx.compose.material.c5 c5Var = this.f32153k;
                r0<com.withings.authentication.mfa.resolve.b> r0Var = this.f32152j;
                CoroutineScope coroutineScope = this.f32151i;
                o1<Boolean> o1Var = this.f32148f;
                r0<Boolean> r0Var2 = this.f32147e;
                MfaResolutionViewModel mfaResolutionViewModel = this.f32154l;
                r0<Boolean> r0Var3 = this.f32146d;
                if (e11) {
                    aVar2.s(-1516054530);
                    String u11 = ay.b.u(C1987R.string.mfa_authenticationApp_activate_confirmOtp_title, aVar2);
                    String u12 = ay.b.u(C1987R.string.mfa_authenticationApp_activate_confirmOtp_description, aVar2);
                    g2.c a11 = s2.d.a(2131231106, aVar2);
                    boolean booleanValue = r0Var3.getValue().booleanValue();
                    boolean booleanValue2 = r0Var2.getValue().booleanValue();
                    boolean booleanValue3 = o1Var.getValue().booleanValue();
                    aVar2.s(-1516053818);
                    Object t11 = aVar2.t();
                    if (t11 == a.C0060a.a()) {
                        t11 = new q(r0Var3);
                        aVar2.n(t11);
                    }
                    ym0.a aVar3 = (ym0.a) t11;
                    Object j5 = w7.j(aVar2, -1516053757);
                    if (j5 == a.C0060a.a()) {
                        j5 = new d0(r0Var3);
                        aVar2.n(j5);
                    }
                    aVar2.J();
                    f0 f0Var = new f0(this.f32149g, this.f32150h);
                    h0 h0Var = new h0(c5Var, r0Var, coroutineScope);
                    i0 i0Var = new i0(mfaResolutionViewModel, c11);
                    com.withings.authentication.mfa.resolve.components.a.a(this.f32144b, this.f32145c, u11, u12, C1987R.string.mfa_authenticationApp_activate_confirmOtp_help, a11, booleanValue, booleanValue2, booleanValue3, aVar3, (ym0.a) j5, f0Var, h0Var, i0Var, aVar2, 805568512, 6);
                    aVar2.J();
                } else if (c11 instanceof c.d) {
                    aVar2.s(-1516052994);
                    String u13 = ay.b.u(C1987R.string.mfa_setup_phoneBased_activate_confirmOtp_whatsappSMS_title, aVar2);
                    String v11 = ay.b.v(C1987R.string.mfa_setup_phoneBased_activate_confirmOtp_whatsapp_description, new Object[]{i.f(((c.d) c11).a())}, aVar2);
                    g2.c a12 = s2.d.a(2131231105, aVar2);
                    boolean booleanValue4 = r0Var3.getValue().booleanValue();
                    boolean booleanValue5 = r0Var2.getValue().booleanValue();
                    boolean booleanValue6 = o1Var.getValue().booleanValue();
                    aVar2.s(-1516052221);
                    Object t12 = aVar2.t();
                    if (t12 == a.C0060a.a()) {
                        t12 = new j0(r0Var3);
                        aVar2.n(t12);
                    }
                    ym0.a aVar4 = (ym0.a) t12;
                    Object j11 = w7.j(aVar2, -1516052160);
                    if (j11 == a.C0060a.a()) {
                        j11 = new k0(r0Var3);
                        aVar2.n(j11);
                    }
                    aVar2.J();
                    l0 l0Var = new l0(mfaResolutionViewModel, c11);
                    n0 n0Var = new n0(c5Var, r0Var, coroutineScope);
                    r rVar = new r(mfaResolutionViewModel, c11);
                    com.withings.authentication.mfa.resolve.components.a.a(this.f32144b, this.f32145c, u13, v11, C1987R.string.mfa_setup_phoneBased_activate_confirmOtp_help, a12, booleanValue4, booleanValue5, booleanValue6, aVar4, (ym0.a) j11, l0Var, n0Var, rVar, aVar2, 805568512, 6);
                    aVar2.J();
                } else if (c11 instanceof c.b) {
                    aVar2.s(-1516050870);
                    String u14 = ay.b.u(C1987R.string.mfa_setup_phoneBased_activate_confirmOtp_whatsappSMS_title, aVar2);
                    String v12 = ay.b.v(C1987R.string.mfa_setup_phoneBased_activate_confirmOtp_sms_description, new Object[]{i.f(((c.b) c11).a())}, aVar2);
                    g2.c a13 = s2.d.a(2131231105, aVar2);
                    boolean booleanValue7 = r0Var3.getValue().booleanValue();
                    boolean booleanValue8 = r0Var2.getValue().booleanValue();
                    boolean booleanValue9 = o1Var.getValue().booleanValue();
                    aVar2.s(-1516050102);
                    Object t13 = aVar2.t();
                    if (t13 == a.C0060a.a()) {
                        t13 = new s(r0Var3);
                        aVar2.n(t13);
                    }
                    ym0.a aVar5 = (ym0.a) t13;
                    Object j12 = w7.j(aVar2, -1516050041);
                    if (j12 == a.C0060a.a()) {
                        j12 = new t(r0Var3);
                        aVar2.n(j12);
                    }
                    aVar2.J();
                    u uVar = new u(mfaResolutionViewModel, c11);
                    w wVar = new w(c5Var, r0Var, coroutineScope);
                    x xVar = new x(mfaResolutionViewModel, c11);
                    com.withings.authentication.mfa.resolve.components.a.a(this.f32144b, this.f32145c, u14, v12, C1987R.string.mfa_setup_phoneBased_activate_confirmOtp_help, a13, booleanValue7, booleanValue8, booleanValue9, aVar5, (ym0.a) j12, uVar, wVar, xVar, aVar2, 805568512, 6);
                    aVar2.J();
                } else if (c11 instanceof c.a) {
                    aVar2.s(-1516048751);
                    String u15 = ay.b.u(C1987R.string.mfa_setup_phoneBased_activate_confirmOtp_phoneCall_title, aVar2);
                    String v13 = ay.b.v(C1987R.string.mfa_setup_phoneBased_activate_confirmOtp_phoneCall_description, new Object[]{i.f(((c.a) c11).a())}, aVar2);
                    g2.c a14 = s2.d.a(2131231105, aVar2);
                    boolean booleanValue10 = r0Var3.getValue().booleanValue();
                    boolean booleanValue11 = r0Var2.getValue().booleanValue();
                    boolean booleanValue12 = o1Var.getValue().booleanValue();
                    aVar2.s(-1516047979);
                    Object t14 = aVar2.t();
                    if (t14 == a.C0060a.a()) {
                        t14 = new y(r0Var3);
                        aVar2.n(t14);
                    }
                    ym0.a aVar6 = (ym0.a) t14;
                    Object j13 = w7.j(aVar2, -1516047918);
                    if (j13 == a.C0060a.a()) {
                        j13 = new z(r0Var3);
                        aVar2.n(j13);
                    }
                    aVar2.J();
                    a0 a0Var = new a0(mfaResolutionViewModel, c11);
                    c0 c0Var = new c0(c5Var, r0Var, coroutineScope);
                    e0 e0Var = new e0(mfaResolutionViewModel, c11);
                    com.withings.authentication.mfa.resolve.components.a.a(this.f32144b, this.f32145c, u15, v13, C1987R.string.mfa_setup_phoneBased_activate_confirmOtp_help, a14, booleanValue10, booleanValue11, booleanValue12, aVar6, (ym0.a) j13, a0Var, c0Var, e0Var, aVar2, 805568512, 6);
                    aVar2.J();
                } else {
                    aVar2.s(-1516046661);
                    aVar2.J();
                }
            }
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(ym0.a<nm0.y> aVar, androidx.compose.runtime.a aVar2, int i11) {
        int i12;
        int i13;
        androidx.compose.runtime.b g11 = aVar2.g(-1701728636);
        if ((i11 & 14) == 0) {
            if (g11.w(aVar)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i12 = i13 | i11;
        } else {
            i12 = i11;
        }
        if ((i12 & 11) == 2 && g11.h()) {
            g11.C();
        } else {
            y7.b(null, s1.b.b(g11, -921046456, new a(aVar)), null, null, null, 0, 0L, 0L, null, kh.a.f75943a, g11, 805306416, ConstantsWs.WS_STATUS_NO_FILTER);
        }
        androidx.compose.runtime.v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new b(aVar, i11));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0321  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01c7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(com.withings.authentication.mfa.resolve.MfaResolutionViewModel r40, ym0.a<nm0.y> r41, ym0.a<nm0.y> r42, ym0.a<nm0.y> r43, ym0.a<nm0.y> r44, androidx.compose.runtime.a r45, int r46, int r47) {
        /*
            Method dump skipped, instructions count: 1007
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.authentication.mfa.resolve.i.b(com.withings.authentication.mfa.resolve.MfaResolutionViewModel, ym0.a, ym0.a, ym0.a, ym0.a, androidx.compose.runtime.a, int, int):void");
    }

    public static final void c(com.withings.authentication.mfa.resolve.b bVar, List list, boolean z5, ym0.l lVar, ym0.a aVar, ym0.a aVar2, ym0.a aVar3, androidx.compose.runtime.a aVar4, int i11) {
        androidx.compose.runtime.b g11 = aVar4.g(-1798298544);
        if (kotlin.jvm.internal.u.e(bVar, b.a.f31959a)) {
            g11.s(408535180);
            int i12 = i11 >> 3;
            com.withings.authentication.mfa.resolve.components.k.a(list, z5, lVar, aVar, aVar2, aVar3, g11, (i12 & 112) | 8 | (i12 & ConstantsWs.HWFAILURE_ZERO) | (i12 & 7168) | (57344 & i12) | (i12 & 458752));
            g11.J();
        } else if (bVar instanceof b.C0423b) {
            g11.s(408535524);
            com.withings.authentication.mfa.resolve.components.n.a(((b.C0423b) bVar).a(), (i11 >> 15) & 112, g11, aVar3);
            g11.J();
        } else if (bVar == null) {
            g11.s(408535654);
            g11.J();
        } else {
            g11.s(408535664);
            g11.J();
        }
        androidx.compose.runtime.v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new com.withings.authentication.mfa.resolve.g(bVar, list, z5, lVar, aVar, aVar2, aVar3, i11));
        }
    }

    public static final void e(r0 r0Var) {
        r0Var.setValue(Boolean.FALSE);
    }

    public static final String f(String str) {
        PhoneNumberUtil i11 = PhoneNumberUtil.i();
        String d11 = i11.d(i11.z(str, "locale"), PhoneNumberUtil.PhoneNumberFormat.f27149b);
        kotlin.jvm.internal.u.g(d11);
        List o11 = dp0.j.o(d11, new String[]{" "});
        List<String> subList = o11.subList(1, o11.size() - 1);
        ArrayList arrayList = new ArrayList(kotlin.collections.x.y(subList, 10));
        for (String str2 : subList) {
            arrayList.add(dp0.j.N(str2.length(), "*"));
        }
        Object I = kotlin.collections.x.I(o11);
        String R = kotlin.collections.x.R(arrayList, " ", null, null, null, 62);
        Object T = kotlin.collections.x.T(o11);
        return I + " " + R + " " + T;
    }
}
