package com.withings.authentication.userCreation;

import android.content.Context;
import androidx.activity.z;
import androidx.compose.foundation.layout.x0;
import androidx.compose.material.ModalBottomSheetValue;
import androidx.compose.material.c5;
import androidx.compose.material.f4;
import androidx.compose.runtime.a;
import androidx.compose.runtime.l0;
import androidx.compose.runtime.v0;
import androidx.compose.ui.platform.k4;
import androidx.compose.ui.platform.n1;
import androidx.compose.ui.platform.u0;
import androidx.lifecycle.h1;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.withings.authentication.accountConsent.AccountConsentViewModel;
import com.withings.common.compose.component.bottomSheet.BottomSheetType;
import com.withings.common.compose.component.v4;
import com.withings.core.webcontent.HMWebActivity;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.user.User;
import com.withings.wiscale2.C1987R;
import java.util.List;
import k1.o1;
import k1.r0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import l70.u;
import nk.a0;
import nm0.y;
import th.a;
import wk.c0;
/* compiled from: UserInfoNavigation.kt */
/* loaded from: classes3.dex */
public final class h {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: UserInfoNavigation.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.authentication.userCreation.UserInfoNavigationKt$HeightWeight$1$1", f = "UserInfoNavigation.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ym0.a<y> f32512a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ UserCreationViewModel f32513b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ CoroutineScope f32514c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ Context f32515d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ o1<a.b> f32516e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ r0<Boolean> f32517f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(ym0.a<y> aVar, UserCreationViewModel userCreationViewModel, CoroutineScope coroutineScope, Context context, o1<? extends a.b> o1Var, r0<Boolean> r0Var, qm0.d<? super a> dVar) {
            super(2, dVar);
            this.f32512a = aVar;
            this.f32513b = userCreationViewModel;
            this.f32514c = coroutineScope;
            this.f32515d = context;
            this.f32516e = o1Var;
            this.f32517f = r0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
            return new a(this.f32512a, this.f32513b, this.f32514c, this.f32515d, this.f32516e, this.f32517f, dVar);
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super y> dVar) {
            return ((a) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            nm0.l.b(obj);
            a.b value = this.f32516e.getValue();
            if (value instanceof a.b.d) {
                this.f32512a.invoke();
            } else if (value instanceof a.b.InterfaceC1655b.c) {
                this.f32513b.p0();
            } else if (value instanceof a.b.InterfaceC1655b.C1657b) {
                this.f32517f.setValue(Boolean.TRUE);
            } else if (value instanceof a.b.InterfaceC1655b) {
                BuildersKt__Builders_commonKt.launch$default(this.f32514c, null, null, new x((a.b.InterfaceC1655b) value, this.f32515d, null), 3, null);
            }
            return y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: UserInfoNavigation.kt */
    /* loaded from: classes3.dex */
    public static final class b extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ User f32518a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(User user) {
            super(2);
            this.f32518a = user;
        }

        @Override // ym0.p
        public final y invoke(androidx.compose.runtime.a aVar, Integer num) {
            androidx.compose.runtime.a aVar2 = aVar;
            if ((num.intValue() & 11) == 2 && aVar2.h()) {
                aVar2.C();
            } else {
                String l5 = this.f32518a.l();
                kotlin.jvm.internal.u.i(l5, "getFirstName(...)");
                v4.b(null, ay.b.v(C1987R.string.signup_personal_info_more_formatted, new Object[]{l5}, aVar2), ay.b.u(C1987R.string.signup_personal_info_more_description, aVar2), null, 0.0f, 0.0f, 0, 0, aVar2, 0, ConstantsWs.WS_STATUS_WRONG_DATE_FORMAT);
            }
            return y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: UserInfoNavigation.kt */
    /* loaded from: classes3.dex */
    public static final class c extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ m70.k f32519a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ o1<Boolean> f32520b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ UserCreationViewModel f32521c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ User f32522d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ AccountConsentViewModel f32523e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(m70.k kVar, o1<Boolean> o1Var, UserCreationViewModel userCreationViewModel, User user, AccountConsentViewModel accountConsentViewModel) {
            super(2);
            this.f32519a = kVar;
            this.f32520b = o1Var;
            this.f32521c = userCreationViewModel;
            this.f32522d = user;
            this.f32523e = accountConsentViewModel;
        }

        @Override // ym0.p
        public final y invoke(androidx.compose.runtime.a aVar, Integer num) {
            androidx.compose.runtime.a aVar2 = aVar;
            if ((num.intValue() & 11) == 2 && aVar2.h()) {
                aVar2.C();
            } else {
                String u11 = ay.b.u(C1987R.string._NEXT_, aVar2);
                m70.k kVar = this.f32519a;
                com.withings.common.compose.component.l.a(null, u11, null, kVar.g(), null, null, this.f32520b.getValue().booleanValue(), new com.withings.authentication.userCreation.i(this.f32523e, this.f32521c, this.f32522d, kVar), aVar2, 0, 53);
            }
            return y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: UserInfoNavigation.kt */
    /* loaded from: classes3.dex */
    public static final class d extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ r0<BottomSheetUnits> f32524a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(r0<BottomSheetUnits> r0Var) {
            super(2);
            this.f32524a = r0Var;
        }

        @Override // ym0.p
        public final y invoke(androidx.compose.runtime.a aVar, Integer num) {
            Integer num2;
            String str;
            androidx.compose.runtime.a aVar2 = aVar;
            if ((num.intValue() & 11) == 2 && aVar2.h()) {
                aVar2.C();
            } else {
                androidx.compose.ui.e g11 = x0.g(androidx.compose.ui.e.f8927a, yk.h.o(), yk.h.B());
                BottomSheetUnits value = this.f32524a.getValue();
                String str2 = null;
                if (value != null) {
                    num2 = Integer.valueOf(value.a());
                } else {
                    num2 = null;
                }
                aVar2.s(1231715397);
                if (num2 != null) {
                    str2 = ay.b.u(num2.intValue(), aVar2);
                }
                aVar2.J();
                if (str2 == null) {
                    str = "";
                } else {
                    str = str2;
                }
                a0.g(0, 0, 28, 0L, aVar2, g11, null, str);
            }
            return y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: UserInfoNavigation.kt */
    /* loaded from: classes3.dex */
    public static final class e extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ m70.k f32525a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ CoroutineScope f32526b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ c5 f32527c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ r0<BottomSheetUnits> f32528d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ UserCreationViewModel f32529e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(m70.k kVar, CoroutineScope coroutineScope, c5 c5Var, r0<BottomSheetUnits> r0Var, UserCreationViewModel userCreationViewModel) {
            super(2);
            this.f32525a = kVar;
            this.f32526b = coroutineScope;
            this.f32527c = c5Var;
            this.f32528d = r0Var;
            this.f32529e = userCreationViewModel;
        }

        @Override // ym0.p
        public final y invoke(androidx.compose.runtime.a aVar, Integer num) {
            boolean z5;
            List h11;
            int f11;
            androidx.compose.runtime.a aVar2 = aVar;
            if ((num.intValue() & 11) == 2 && aVar2.h()) {
                aVar2.C();
            } else {
                if (this.f32528d.getValue() == BottomSheetUnits.f32471b) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                l70.u.f78815b.getClass();
                if (z5) {
                    h11 = u.a.g();
                } else {
                    h11 = u.a.h();
                }
                List list = h11;
                m70.k kVar = this.f32525a;
                if (z5) {
                    f11 = kVar.c();
                } else {
                    f11 = kVar.f();
                }
                int i11 = f11;
                com.withings.authentication.userCreation.j jVar = new com.withings.authentication.userCreation.j(z5, kVar, this.f32529e);
                tj.r.a(this.f32526b, list, i11, this.f32527c, jVar, aVar2, 4168);
            }
            return y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: UserInfoNavigation.kt */
    /* loaded from: classes3.dex */
    public static final class f extends kotlin.jvm.internal.w implements ym0.q<r0.h, androidx.compose.runtime.a, Integer, y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ m70.k f32530a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ k4 f32531b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ CoroutineScope f32532c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ r0<BottomSheetUnits> f32533d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ c5 f32534e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ Context f32535f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ b2.f f32536g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ UserCreationViewModel f32537h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ User f32538i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ AccountConsentViewModel f32539j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(m70.k kVar, k4 k4Var, CoroutineScope coroutineScope, r0 r0Var, c5 c5Var, Context context, b2.f fVar, UserCreationViewModel userCreationViewModel, User user, AccountConsentViewModel accountConsentViewModel) {
            super(3);
            this.f32530a = kVar;
            this.f32531b = k4Var;
            this.f32532c = coroutineScope;
            this.f32533d = r0Var;
            this.f32534e = c5Var;
            this.f32535f = context;
            this.f32536g = fVar;
            this.f32537h = userCreationViewModel;
            this.f32538i = user;
            this.f32539j = accountConsentViewModel;
        }

        @Override // ym0.q
        public final y invoke(r0.h hVar, androidx.compose.runtime.a aVar, Integer num) {
            r0.h GuidedPresentationWithBottomSheet = hVar;
            androidx.compose.runtime.a aVar2 = aVar;
            int intValue = num.intValue();
            kotlin.jvm.internal.u.j(GuidedPresentationWithBottomSheet, "$this$GuidedPresentationWithBottomSheet");
            if ((intValue & 81) == 16 && aVar2.h()) {
                aVar2.C();
            } else {
                com.withings.authentication.userCreation.l lVar = new com.withings.authentication.userCreation.l(this.f32531b, this.f32532c, this.f32533d, 250L, this.f32534e);
                com.withings.authentication.userCreation.n nVar = new com.withings.authentication.userCreation.n(this.f32531b, this.f32532c, this.f32533d, 250L, this.f32534e);
                com.withings.authentication.userCreation.o oVar = new com.withings.authentication.userCreation.o(this.f32535f);
                p pVar = new p(this.f32531b, this.f32536g, this.f32530a, this.f32537h, this.f32538i, this.f32539j);
                int i11 = m70.k.f81664h;
                m70.j.a(false, false, 7, this.f32530a, null, false, lVar, nVar, oVar, pVar, aVar2, ConstantsWs.WS_STATUS_LOGIN_UNAUTHORIZED, 51);
                nk.u.d(0, 0, 0, 60, 0L, aVar2, x0.g(androidx.compose.ui.e.f8927a, yk.h.o(), yk.h.b()), null, ay.b.u(C1987R.string.signup_personal_info_metrics_disclaimer, aVar2));
            }
            return y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: UserInfoNavigation.kt */
    /* loaded from: classes3.dex */
    public static final class g extends kotlin.jvm.internal.w implements ym0.a<y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ r0<Boolean> f32540a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(r0<Boolean> r0Var) {
            super(0);
            this.f32540a = r0Var;
        }

        @Override // ym0.a
        public final y invoke() {
            this.f32540a.setValue(Boolean.FALSE);
            return y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: UserInfoNavigation.kt */
    /* renamed from: com.withings.authentication.userCreation.h$h  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static final class C0438h extends kotlin.jvm.internal.w implements ym0.a<y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Context f32541a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f32542b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f32543c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ r0<Boolean> f32544d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0438h(Context context, String str, String str2, r0<Boolean> r0Var) {
            super(0);
            this.f32541a = context;
            this.f32542b = str;
            this.f32543c = str2;
            this.f32544d = r0Var;
        }

        @Override // ym0.a
        public final y invoke() {
            HMWebActivity.a aVar = HMWebActivity.f35395c;
            String str = this.f32542b;
            String str2 = this.f32543c;
            Context context = this.f32541a;
            context.startActivity(aVar.c(context, str, str2));
            this.f32544d.setValue(Boolean.FALSE);
            return y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: UserInfoNavigation.kt */
    /* loaded from: classes3.dex */
    public static final class i extends kotlin.jvm.internal.w implements ym0.a<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ o1<a.b> f32545a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(r0 r0Var) {
            super(0);
            this.f32545a = r0Var;
        }

        @Override // ym0.a
        public final Boolean invoke() {
            return Boolean.valueOf(this.f32545a.getValue() instanceof a.b.c);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: UserInfoNavigation.kt */
    /* loaded from: classes3.dex */
    public static final class j extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ UserCreationViewModel f32546a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ AccountConsentViewModel f32547b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ z f32548c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ ym0.a<y> f32549d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ User f32550e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ ym0.a<y> f32551f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ int f32552g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(UserCreationViewModel userCreationViewModel, AccountConsentViewModel accountConsentViewModel, z zVar, ym0.a<y> aVar, User user, ym0.a<y> aVar2, int i11) {
            super(2);
            this.f32546a = userCreationViewModel;
            this.f32547b = accountConsentViewModel;
            this.f32548c = zVar;
            this.f32549d = aVar;
            this.f32550e = user;
            this.f32551f = aVar2;
            this.f32552g = i11;
        }

        @Override // ym0.p
        public final y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = ah.o.g(this.f32552g | 1);
            User user = this.f32550e;
            ym0.a<y> aVar2 = this.f32551f;
            h.a(this.f32546a, this.f32547b, this.f32548c, this.f32549d, user, aVar2, aVar, g11);
            return y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: UserInfoNavigation.kt */
    /* loaded from: classes3.dex */
    public static final class k extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ UserCreationViewModel f32553a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ym0.a<y> f32554b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(UserCreationViewModel userCreationViewModel, ym0.a<y> aVar) {
            super(2);
            this.f32553a = userCreationViewModel;
            this.f32554b = aVar;
        }

        @Override // ym0.p
        public final y invoke(androidx.compose.runtime.a aVar, Integer num) {
            androidx.compose.runtime.a aVar2 = aVar;
            if ((num.intValue() & 11) == 2 && aVar2.h()) {
                aVar2.C();
            } else {
                String u11 = ay.b.u(C1987R.string._CONTINUE_APP_, aVar2);
                UserCreationViewModel userCreationViewModel = this.f32553a;
                com.withings.common.compose.component.l.a(null, u11, null, userCreationViewModel.F0().q(), null, null, false, new r(userCreationViewModel, this.f32554b), aVar2, 0, 117);
            }
            return y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: UserInfoNavigation.kt */
    /* loaded from: classes3.dex */
    public static final class l extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ CoroutineScope f32555a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ c5 f32556b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ UserCreationViewModel f32557c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ r0<BottomSheetType> f32558d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(CoroutineScope coroutineScope, c5 c5Var, UserCreationViewModel userCreationViewModel, r0<BottomSheetType> r0Var) {
            super(2);
            this.f32555a = coroutineScope;
            this.f32556b = c5Var;
            this.f32557c = userCreationViewModel;
            this.f32558d = r0Var;
        }

        @Override // ym0.p
        public final y invoke(androidx.compose.runtime.a aVar, Integer num) {
            androidx.compose.runtime.a aVar2 = aVar;
            if ((num.intValue() & 11) == 2 && aVar2.h()) {
                aVar2.C();
            } else {
                h.c(this.f32555a, this.f32558d.getValue(), this.f32556b, this.f32557c.F0(), aVar2, ConstantsWs.WS_STATUS_ALREADY_EXIST);
            }
            return y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: UserInfoNavigation.kt */
    /* loaded from: classes3.dex */
    public static final class m extends kotlin.jvm.internal.w implements ym0.q<r0.h, androidx.compose.runtime.a, Integer, y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ UserCreationViewModel f32559a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ k4 f32560b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ CoroutineScope f32561c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ r0<BottomSheetType> f32562d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ c5 f32563e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ b2.f f32564f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m(UserCreationViewModel userCreationViewModel, k4 k4Var, CoroutineScope coroutineScope, r0<BottomSheetType> r0Var, c5 c5Var, b2.f fVar) {
            super(3);
            this.f32559a = userCreationViewModel;
            this.f32560b = k4Var;
            this.f32561c = coroutineScope;
            this.f32562d = r0Var;
            this.f32563e = c5Var;
            this.f32564f = fVar;
        }

        @Override // ym0.q
        public final y invoke(r0.h hVar, androidx.compose.runtime.a aVar, Integer num) {
            r0.h GuidedPresentationWithBottomSheet = hVar;
            androidx.compose.runtime.a aVar2 = aVar;
            int intValue = num.intValue();
            kotlin.jvm.internal.u.j(GuidedPresentationWithBottomSheet, "$this$GuidedPresentationWithBottomSheet");
            if ((intValue & 81) == 16 && aVar2.h()) {
                aVar2.C();
            } else {
                m70.f F0 = this.f32559a.F0();
                k4 k4Var = this.f32560b;
                CoroutineScope coroutineScope = this.f32561c;
                r0<BottomSheetType> r0Var = this.f32562d;
                c5 c5Var = this.f32563e;
                m70.e.a(F0, false, false, false, 0, new s(k4Var, coroutineScope, r0Var, c5Var), new t(k4Var, coroutineScope, r0Var, c5Var), new u(k4Var, coroutineScope, r0Var, c5Var), new v(this.f32564f), aVar2, 3072, 22);
            }
            return y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: UserInfoNavigation.kt */
    /* loaded from: classes3.dex */
    public static final class n extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ UserCreationViewModel f32565a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ z f32566b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ym0.a<y> f32567c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ ym0.a<y> f32568d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ int f32569e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(UserCreationViewModel userCreationViewModel, z zVar, ym0.a<y> aVar, ym0.a<y> aVar2, int i11) {
            super(2);
            this.f32565a = userCreationViewModel;
            this.f32566b = zVar;
            this.f32567c = aVar;
            this.f32568d = aVar2;
            this.f32569e = i11;
        }

        @Override // ym0.p
        public final y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = ah.o.g(this.f32569e | 1);
            ym0.a<y> aVar2 = this.f32567c;
            ym0.a<y> aVar3 = this.f32568d;
            h.b(this.f32565a, this.f32566b, aVar2, aVar3, aVar, g11);
            return y.f85009a;
        }
    }

    /* compiled from: UserInfoNavigation.kt */
    /* loaded from: classes3.dex */
    public /* synthetic */ class o {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f32570a;

        static {
            int[] iArr = new int[BottomSheetType.values().length];
            try {
                BottomSheetType bottomSheetType = BottomSheetType.f33473b;
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                BottomSheetType bottomSheetType2 = BottomSheetType.f33473b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                BottomSheetType bottomSheetType3 = BottomSheetType.f33473b;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f32570a = iArr;
        }
    }

    public static final void a(UserCreationViewModel userCreationViewModel, AccountConsentViewModel accountConsentViewModel, z onBackPressedDispatcherOwner, ym0.a<y> onBack, User user, ym0.a<y> onContinueClicked, androidx.compose.runtime.a aVar, int i11) {
        androidx.compose.runtime.b bVar;
        r0 r0Var;
        kotlin.jvm.internal.u.j(userCreationViewModel, "userCreationViewModel");
        kotlin.jvm.internal.u.j(accountConsentViewModel, "accountConsentViewModel");
        kotlin.jvm.internal.u.j(onBackPressedDispatcherOwner, "onBackPressedDispatcherOwner");
        kotlin.jvm.internal.u.j(onBack, "onBack");
        kotlin.jvm.internal.u.j(user, "user");
        kotlin.jvm.internal.u.j(onContinueClicked, "onContinueClicked");
        androidx.compose.runtime.b g11 = aVar.g(229319946);
        om.d y02 = userCreationViewModel.y0();
        int i12 = om.d.f87714f;
        om.a aVar2 = (om.a) t1.d.a(y02, g11).getValue();
        m70.k G0 = userCreationViewModel.G0();
        if (aVar2 == null) {
            bVar = g11;
        } else {
            Object c11 = androidx.compose.material.o.c(g11, 773894976, -492369756);
            if (c11 == a.C0060a.a()) {
                c11 = androidx.datastore.preferences.protobuf.e.b(k1.y.i(g11), g11);
            }
            g11.J();
            CoroutineScope a11 = ((androidx.compose.runtime.k) c11).a();
            k4 k4Var = (k4) androidx.appcompat.view.menu.d.b(g11);
            b2.f fVar = (b2.f) g11.D(n1.f());
            c5 f11 = f4.f(ModalBottomSheetValue.f4842a, null, false, g11, 14);
            g11.s(-1624079990);
            Object t11 = g11.t();
            if (t11 == a.C0060a.a()) {
                t11 = l0.f(null, v0.f8878a);
                g11.n(t11);
            }
            r0 r0Var2 = (r0) t11;
            g11.J();
            Context context = (Context) g11.D(u0.d());
            r0 a12 = l0.a(userCreationViewModel.r0(), a.b.C1654a.f99779a, null, g11, 2);
            g11.s(-1624079759);
            boolean K = g11.K((a.b) a12.getValue());
            Object t12 = g11.t();
            if (K || t12 == a.C0060a.a()) {
                t12 = l0.e(new i(a12));
                g11.n(t12);
            }
            o1 o1Var = (o1) t12;
            Object a13 = com.huawei.hms.health.a.a(g11, -1624079640);
            if (a13 == a.C0060a.a()) {
                a13 = l0.f(Boolean.FALSE, v0.f8878a);
                g11.n(a13);
            }
            r0 r0Var3 = (r0) a13;
            g11.J();
            k1.y.f((a.b) a12.getValue(), new a(onContinueClicked, userCreationViewModel, a11, context, a12, r0Var3, null), g11);
            bVar = g11;
            c0.d(a11, onBackPressedDispatcherOwner, onBack, null, null, s1.b.b(g11, 2027426689, new b(user)), s1.b.b(g11, -1819425022, new c(G0, o1Var, userCreationViewModel, user, accountConsentViewModel)), null, false, 0L, f11, s1.b.b(g11, 1533691476, new d(r0Var2)), s1.b.b(g11, 1981807061, new e(G0, a11, f11, r0Var2, userCreationViewModel)), x0.a(0.0f, yk.h.q(), 1), null, null, false, s1.b.b(bVar, 95524298, new f(G0, k4Var, a11, r0Var2, f11, context, fVar, userCreationViewModel, user, accountConsentViewModel)), bVar, ((i11 >> 3) & ConstantsWs.HWFAILURE_ZERO) | 1769544, 12583352, 115608);
            bVar.s(-2013808693);
            if (((Boolean) r0Var3.getValue()).booleanValue()) {
                String u11 = ay.b.u(C1987R.string.emailConflict_titleError, bVar);
                String u12 = ay.b.u(C1987R.string.emailConflict_articleUrl, bVar);
                bVar.s(-1624074918);
                Object t13 = bVar.t();
                if (t13 == a.C0060a.a()) {
                    r0Var = r0Var3;
                    t13 = new g(r0Var);
                    bVar.n(t13);
                } else {
                    r0Var = r0Var3;
                }
                bVar.J();
                wk.p.a((ym0.a) t13, ay.b.u(C1987R.string.emailConflict_titleError, bVar), ay.b.u(C1987R.string.emailConflict_messageError, bVar), ay.b.u(C1987R.string._CONTINUE_APP_, bVar), 0L, new C0438h(context, u11, u12, r0Var), null, 0L, null, bVar, 6, 464);
            }
            bVar.J();
        }
        androidx.compose.runtime.v o02 = bVar.o0();
        if (o02 != null) {
            o02.G(new j(userCreationViewModel, accountConsentViewModel, onBackPressedDispatcherOwner, onBack, user, onContinueClicked, i11));
        }
    }

    public static final void b(UserCreationViewModel viewModel, z onBackPressedDispatcherOwner, ym0.a<y> onBack, ym0.a<y> onContinue, androidx.compose.runtime.a aVar, int i11) {
        kotlin.jvm.internal.u.j(viewModel, "viewModel");
        kotlin.jvm.internal.u.j(onBackPressedDispatcherOwner, "onBackPressedDispatcherOwner");
        kotlin.jvm.internal.u.j(onBack, "onBack");
        kotlin.jvm.internal.u.j(onContinue, "onContinue");
        androidx.compose.runtime.b g11 = aVar.g(-1298162980);
        c5 f11 = f4.f(ModalBottomSheetValue.f4842a, null, false, g11, 14);
        g11.s(-2068918074);
        Object t11 = g11.t();
        if (t11 == a.C0060a.a()) {
            t11 = l0.f(null, v0.f8878a);
            g11.n(t11);
        }
        r0 r0Var = (r0) t11;
        g11.J();
        g11.s(773894976);
        g11.s(-492369756);
        Object t12 = g11.t();
        if (t12 == a.C0060a.a()) {
            t12 = androidx.datastore.preferences.protobuf.e.b(k1.y.i(g11), g11);
        }
        g11.J();
        CoroutineScope a11 = ((androidx.compose.runtime.k) t12).a();
        k4 k4Var = (k4) androidx.appcompat.view.menu.d.b(g11);
        b2.f fVar = (b2.f) g11.D(n1.f());
        c0.d(a11, onBackPressedDispatcherOwner, onBack, null, null, uh.a.f102126a, s1.b.b(g11, -1561770143, new k(viewModel, onContinue)), null, false, 0L, f11, uh.a.f102127b, s1.b.b(g11, 556857780, new l(a11, f11, viewModel, r0Var)), x0.a(0.0f, yk.h.q(), 1), null, null, false, s1.b.b(g11, -543389143, new m(viewModel, k4Var, a11, r0Var, f11, fVar)), g11, (i11 & ConstantsWs.HWFAILURE_ZERO) | 1769544, 12583352, 115608);
        androidx.compose.runtime.v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new n(viewModel, onBackPressedDispatcherOwner, onBack, onContinue, i11));
        }
    }

    public static final void c(CoroutineScope coroutineScope, BottomSheetType bottomSheetType, c5 c5Var, m70.f fVar, androidx.compose.runtime.a aVar, int i11) {
        int i12;
        androidx.compose.runtime.b g11 = aVar.g(1311406294);
        if (bottomSheetType == null) {
            i12 = -1;
        } else {
            i12 = o.f32570a[bottomSheetType.ordinal()];
        }
        if (i12 != 1) {
            if (i12 != 2) {
                if (i12 != 3) {
                    g11.s(-19625472);
                    g11.J();
                    if (bottomSheetType != null) {
                        throw new IllegalStateException("Bottomsheet content for type " + bottomSheetType + " is not handled in this form");
                    }
                } else {
                    g11.s(-19625744);
                    tj.p.a(coroutineScope, fVar.p(), c5Var, new com.withings.authentication.userCreation.f(fVar), g11, 520 | (i11 & ConstantsWs.HWFAILURE_ZERO));
                    g11.J();
                }
            } else {
                g11.s(-19626032);
                tj.e.a(coroutineScope, fVar.a(), c5Var, new com.withings.authentication.userCreation.e(fVar), g11, 520 | (i11 & ConstantsWs.HWFAILURE_ZERO));
                g11.J();
            }
        } else {
            g11.s(-19626296);
            tj.e.b(coroutineScope, fVar.k(), c5Var, new com.withings.authentication.userCreation.d(fVar), g11, 520 | (i11 & ConstantsWs.HWFAILURE_ZERO));
            g11.J();
        }
        androidx.compose.runtime.v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new com.withings.authentication.userCreation.g(coroutineScope, bottomSheetType, c5Var, fVar, i11));
        }
    }

    public static final void d(AccountConsentViewModel accountConsentViewModel, UserCreationViewModel userCreationViewModel, User user, m70.k kVar) {
        double d11;
        Double b10 = kVar.b();
        double d12 = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
        if (b10 != null) {
            d11 = b10.doubleValue();
        } else {
            d11 = 0.0d;
        }
        Double e11 = kVar.e();
        if (e11 != null) {
            d12 = e11.doubleValue();
        }
        boolean g02 = accountConsentViewModel.g0();
        userCreationViewModel.getClass();
        kotlin.jvm.internal.u.j(user, "user");
        BuildersKt__Builders_commonKt.launch$default(h1.a(userCreationViewModel), Dispatchers.getIO(), null, new com.withings.authentication.userCreation.a(userCreationViewModel, user, d11, d12, g02, null), 2, null);
    }

    public static final void e(k4 k4Var, CoroutineScope coroutineScope, r0 r0Var, c5 c5Var, BottomSheetType bottomSheetType) {
        r0Var.setValue(bottomSheetType);
        if (k4Var != null) {
            k4Var.a();
        }
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new w(c5Var, null), 3, null);
    }
}
