package com.withings.wiscale2.settings;

import androidx.compose.material3.g9;
import androidx.compose.runtime.a;
import androidx.compose.ui.e;
import androidx.compose.ui.node.g;
import com.withings.common.compose.component.input.InputFieldType;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.network.android.PasswordHasNoDigitException;
import com.withings.network.android.PasswordHasNoLowercaseException;
import com.withings.network.android.PasswordHasNoUppercaseException;
import com.withings.network.android.PasswordTooLongException;
import com.withings.network.android.PasswordTooShortException;
import com.withings.webservices.legacy.common.exception.WrongOldPasswordException;
import com.withings.wiscale2.C1987R;
import com.withings.wiscale2.settings.i;
import java.util.List;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
/* compiled from: Password.kt */
/* loaded from: classes5.dex */
public final class l0 {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Password.kt */
    /* loaded from: classes5.dex */
    public static final class a extends kotlin.jvm.internal.w implements ym0.a<nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ k1.r0<Boolean> f60115a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(k1.r0<Boolean> r0Var) {
            super(0);
            this.f60115a = r0Var;
        }

        @Override // ym0.a
        public final nm0.y invoke() {
            this.f60115a.setValue(Boolean.FALSE);
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Password.kt */
    /* loaded from: classes5.dex */
    public static final class b extends kotlin.jvm.internal.w implements ym0.a<nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ SettingsViewModel f60116a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f60117b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ k1.r0<Boolean> f60118c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(SettingsViewModel settingsViewModel, ym0.a<nm0.y> aVar, k1.r0<Boolean> r0Var) {
            super(0);
            this.f60116a = settingsViewModel;
            this.f60117b = aVar;
            this.f60118c = r0Var;
        }

        @Override // ym0.a
        public final nm0.y invoke() {
            this.f60118c.setValue(Boolean.FALSE);
            SettingsViewModel settingsViewModel = this.f60116a;
            settingsViewModel.getClass();
            BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.h1.a(settingsViewModel), Dispatchers.getIO(), null, new j5(settingsViewModel, null), 2, null);
            this.f60117b.invoke();
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Password.kt */
    /* loaded from: classes5.dex */
    public static final class c extends kotlin.jvm.internal.w implements ym0.a<nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ k1.r0<Boolean> f60119a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(k1.r0<Boolean> r0Var) {
            super(0);
            this.f60119a = r0Var;
        }

        @Override // ym0.a
        public final nm0.y invoke() {
            this.f60119a.setValue(Boolean.FALSE);
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Password.kt */
    /* loaded from: classes5.dex */
    public static final class d extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f60120a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ k1.r0<Boolean> f60121b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ k1.o1<com.withings.wiscale2.settings.i> f60122c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.platform.k4 f60123d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ SettingsViewModel f60124e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ k1.r0<String> f60125f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ k1.r0<String> f60126g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ k1.r0<InputFieldType> f60127h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ k1.r0<b2.k> f60128i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ com.withings.wiscale2.account.password.r f60129j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ k1.r0<Boolean> f60130k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(ym0.a aVar, k1.r0 r0Var, k1.r0 r0Var2, androidx.compose.ui.platform.k4 k4Var, SettingsViewModel settingsViewModel, k1.r0 r0Var3, k1.r0 r0Var4, k1.r0 r0Var5, k1.r0 r0Var6, com.withings.wiscale2.account.password.r rVar, k1.r0 r0Var7) {
            super(2);
            this.f60120a = aVar;
            this.f60121b = r0Var;
            this.f60122c = r0Var2;
            this.f60123d = k4Var;
            this.f60124e = settingsViewModel;
            this.f60125f = r0Var3;
            this.f60126g = r0Var4;
            this.f60127h = r0Var5;
            this.f60128i = r0Var6;
            this.f60129j = rVar;
            this.f60130k = r0Var7;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            androidx.compose.runtime.a aVar2 = aVar;
            if ((num.intValue() & 11) == 2 && aVar2.h()) {
                aVar2.C();
            } else {
                androidx.compose.material.t5.b(ah.k.m(androidx.compose.ui.e.f8927a), null, s1.b.b(aVar2, 13661480, new m0(this.f60120a)), s1.b.b(aVar2, 257198343, new p0(this.f60121b, this.f60122c, this.f60123d, this.f60124e, this.f60125f, this.f60126g)), null, null, 0, false, null, false, null, 0.0f, 0L, 0L, 0L, 0L, 0L, s1.b.b(aVar2, -1690348017, new v0(this.f60127h, this.f60128i, this.f60129j, this.f60126g, this.f60130k, this.f60125f, this.f60121b, this.f60123d, this.f60124e)), aVar2, 3456, 12582912, 131058);
            }
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Password.kt */
    /* loaded from: classes5.dex */
    public static final class e extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ SettingsViewModel f60131a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f60132b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f60133c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ ym0.l<String, nm0.y> f60134d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ int f60135e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        e(SettingsViewModel settingsViewModel, ym0.a<nm0.y> aVar, ym0.a<nm0.y> aVar2, ym0.l<? super String, nm0.y> lVar, int i11) {
            super(2);
            this.f60131a = settingsViewModel;
            this.f60132b = aVar;
            this.f60133c = aVar2;
            this.f60134d = lVar;
            this.f60135e = i11;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = ah.o.g(this.f60135e | 1);
            ym0.a<nm0.y> aVar2 = this.f60133c;
            ym0.l<String, nm0.y> lVar = this.f60134d;
            l0.a(this.f60131a, this.f60132b, aVar2, lVar, aVar, g11);
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Password.kt */
    /* loaded from: classes5.dex */
    public static final class f extends kotlin.jvm.internal.w implements ym0.a<nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f60136a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(ym0.a<nm0.y> aVar) {
            super(0);
            this.f60136a = aVar;
        }

        @Override // ym0.a
        public final nm0.y invoke() {
            this.f60136a.invoke();
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Password.kt */
    /* loaded from: classes5.dex */
    public static final class g extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f60137a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(ym0.a<nm0.y> aVar) {
            super(2);
            this.f60137a = aVar;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            androidx.compose.runtime.a aVar2 = aVar;
            if ((num.intValue() & 11) == 2 && aVar2.h()) {
                aVar2.C();
            } else {
                com.withings.common.compose.component.l.a(null, ay.b.u(C1987R.string._CONTINUE_APP_, aVar2), null, false, null, null, false, this.f60137a, aVar2, 0, 125);
            }
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Password.kt */
    /* loaded from: classes5.dex */
    public static final class h extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f60138a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f60139b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f60140c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(ym0.a<nm0.y> aVar, ym0.a<nm0.y> aVar2, int i11) {
            super(2);
            this.f60138a = aVar;
            this.f60139b = aVar2;
            this.f60140c = i11;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = ah.o.g(this.f60140c | 1);
            l0.b(this.f60138a, this.f60139b, aVar, g11);
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Password.kt */
    /* loaded from: classes5.dex */
    public static final class i extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f60141a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.withings.wiscale2.account.password.r f60142b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ k1.r0<String> f60143c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ k1.r0<Boolean> f60144d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.platform.k4 f60145e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ SettingsViewModel f60146f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ k1.r0<Boolean> f60147g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(ym0.a<nm0.y> aVar, com.withings.wiscale2.account.password.r rVar, k1.r0<String> r0Var, k1.r0<Boolean> r0Var2, androidx.compose.ui.platform.k4 k4Var, SettingsViewModel settingsViewModel, k1.r0<Boolean> r0Var3) {
            super(2);
            this.f60141a = aVar;
            this.f60142b = rVar;
            this.f60143c = r0Var;
            this.f60144d = r0Var2;
            this.f60145e = k4Var;
            this.f60146f = settingsViewModel;
            this.f60147g = r0Var3;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            androidx.compose.runtime.a aVar2 = aVar;
            if ((num.intValue() & 11) == 2 && aVar2.h()) {
                aVar2.C();
            } else {
                androidx.compose.material.t5.b(null, null, s1.b.b(aVar2, 1497645660, new w0(this.f60141a)), null, null, null, 0, false, null, false, null, 0.0f, 0L, 0L, 0L, 0L, 0L, s1.b.b(aVar2, -206363837, new b1(this.f60142b, this.f60143c, this.f60144d, this.f60145e, this.f60146f, this.f60147g)), aVar2, ConstantsWs.WS_STATUS_LOGIN_UNAUTHORIZED, 12582912, 131067);
            }
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Password.kt */
    /* loaded from: classes5.dex */
    public static final class j extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ SettingsViewModel f60148a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f60149b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f60150c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ ym0.l<String, nm0.y> f60151d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ int f60152e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        j(SettingsViewModel settingsViewModel, ym0.a<nm0.y> aVar, ym0.a<nm0.y> aVar2, ym0.l<? super String, nm0.y> lVar, int i11) {
            super(2);
            this.f60148a = settingsViewModel;
            this.f60149b = aVar;
            this.f60150c = aVar2;
            this.f60151d = lVar;
            this.f60152e = i11;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = ah.o.g(this.f60152e | 1);
            ym0.a<nm0.y> aVar2 = this.f60150c;
            ym0.l<String, nm0.y> lVar = this.f60151d;
            l0.c(this.f60148a, this.f60149b, aVar2, lVar, aVar, g11);
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Password.kt */
    /* loaded from: classes5.dex */
    public static final class k extends kotlin.jvm.internal.w implements ym0.l<String, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ym0.p<String, String, nm0.y> f60153a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ k1.r0<String> f60154b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ k1.r0<String> f60155c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(k1.r0 r0Var, k1.r0 r0Var2, ym0.p pVar) {
            super(1);
            this.f60153a = pVar;
            this.f60154b = r0Var;
            this.f60155c = r0Var2;
        }

        @Override // ym0.l
        public final nm0.y invoke(String str) {
            String text = str;
            kotlin.jvm.internal.u.j(text, "text");
            k1.r0<String> r0Var = this.f60154b;
            r0Var.setValue(text);
            this.f60153a.invoke(r0Var.getValue(), this.f60155c.getValue());
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Password.kt */
    /* loaded from: classes5.dex */
    public static final class l extends kotlin.jvm.internal.w implements ym0.a<nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b2.k f60156a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(b2.k kVar) {
            super(0);
            this.f60156a = kVar;
        }

        @Override // ym0.a
        public final nm0.y invoke() {
            this.f60156a.c();
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Password.kt */
    /* loaded from: classes5.dex */
    public static final class m extends kotlin.jvm.internal.w implements ym0.l<String, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ym0.p<String, String, nm0.y> f60157a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ k1.r0<String> f60158b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ k1.r0<String> f60159c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m(k1.r0 r0Var, k1.r0 r0Var2, ym0.p pVar) {
            super(1);
            this.f60157a = pVar;
            this.f60158b = r0Var;
            this.f60159c = r0Var2;
        }

        @Override // ym0.l
        public final nm0.y invoke(String str) {
            String text = str;
            kotlin.jvm.internal.u.j(text, "text");
            k1.r0<String> r0Var = this.f60158b;
            r0Var.setValue(text);
            this.f60157a.invoke(this.f60159c.getValue(), r0Var.getValue());
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Password.kt */
    /* loaded from: classes5.dex */
    public static final class n extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f60160a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ b2.k f60161b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ com.withings.wiscale2.account.password.r f60162c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ ym0.p<String, String, nm0.y> f60163d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f60164e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ int f60165f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        n(String str, b2.k kVar, com.withings.wiscale2.account.password.r rVar, ym0.p<? super String, ? super String, nm0.y> pVar, ym0.a<nm0.y> aVar, int i11) {
            super(2);
            this.f60160a = str;
            this.f60161b = kVar;
            this.f60162c = rVar;
            this.f60163d = pVar;
            this.f60164e = aVar;
            this.f60165f = i11;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = ah.o.g(this.f60165f | 1);
            ym0.p<String, String, nm0.y> pVar = this.f60163d;
            ym0.a<nm0.y> aVar2 = this.f60164e;
            l0.d(this.f60160a, this.f60161b, this.f60162c, pVar, aVar2, aVar, g11);
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Password.kt */
    /* loaded from: classes5.dex */
    public static final class o extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ k1.r0<InputFieldType> f60166a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        o(k1.r0<InputFieldType> r0Var) {
            super(2);
            this.f60166a = r0Var;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            androidx.compose.runtime.a aVar2 = aVar;
            if ((num.intValue() & 11) == 2 && aVar2.h()) {
                aVar2.C();
            } else {
                fk.d0.a(this.f60166a, 0L, aVar2, 0, 2);
            }
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Password.kt */
    /* loaded from: classes5.dex */
    public static final class p extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.e f60167a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f60168b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ k1.r0<InputFieldType> f60169c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f60170d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ Integer f60171e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ ym0.l<String, nm0.y> f60172f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ b2.k f60173g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ int f60174h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f60175i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ List<fk.t> f60176j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ int f60177k;

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ int f60178l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        p(androidx.compose.ui.e eVar, String str, k1.r0<InputFieldType> r0Var, String str2, Integer num, ym0.l<? super String, nm0.y> lVar, b2.k kVar, int i11, ym0.a<nm0.y> aVar, List<fk.t> list, int i12, int i13) {
            super(2);
            this.f60167a = eVar;
            this.f60168b = str;
            this.f60169c = r0Var;
            this.f60170d = str2;
            this.f60171e = num;
            this.f60172f = lVar;
            this.f60173g = kVar;
            this.f60174h = i11;
            this.f60175i = aVar;
            this.f60176j = list;
            this.f60177k = i12;
            this.f60178l = i13;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = ah.o.g(this.f60177k | 1);
            ym0.a<nm0.y> aVar2 = this.f60175i;
            List<fk.t> list = this.f60176j;
            l0.e(this.f60167a, this.f60168b, this.f60169c, this.f60170d, this.f60171e, this.f60172f, this.f60173g, this.f60174h, aVar2, list, aVar, g11, this.f60178l);
            return nm0.y.f85009a;
        }
    }

    public static final void a(SettingsViewModel viewModel, ym0.a<nm0.y> onBack, ym0.a<nm0.y> onNext, ym0.l<? super String, nm0.y> onError, androidx.compose.runtime.a aVar, int i11) {
        com.withings.wiscale2.account.password.r rVar;
        kotlin.jvm.internal.u.j(viewModel, "viewModel");
        kotlin.jvm.internal.u.j(onBack, "onBack");
        kotlin.jvm.internal.u.j(onNext, "onNext");
        kotlin.jvm.internal.u.j(onError, "onError");
        androidx.compose.runtime.b g11 = aVar.g(1743238759);
        k1.r0 b10 = t1.d.b(viewModel.A0(), null, g11);
        g11.s(472939477);
        Object t11 = g11.t();
        if (t11 == a.C0060a.a()) {
            t11 = androidx.compose.runtime.l0.f("", androidx.compose.runtime.v0.f8878a);
            g11.n(t11);
        }
        k1.r0 r0Var = (k1.r0) t11;
        Object a11 = com.huawei.hms.health.a.a(g11, 472939535);
        if (a11 == a.C0060a.a()) {
            a11 = androidx.compose.runtime.l0.f("", androidx.compose.runtime.v0.f8878a);
            g11.n(a11);
        }
        k1.r0 r0Var2 = (k1.r0) a11;
        Object a12 = com.huawei.hms.health.a.a(g11, 472939596);
        if (a12 == a.C0060a.a()) {
            a12 = androidx.compose.runtime.l0.f(Boolean.FALSE, androidx.compose.runtime.v0.f8878a);
            g11.n(a12);
        }
        k1.r0 r0Var3 = (k1.r0) a12;
        Object a13 = com.huawei.hms.health.a.a(g11, 472939664);
        if (a13 == a.C0060a.a()) {
            a13 = androidx.compose.runtime.l0.f(new b2.k(), androidx.compose.runtime.v0.f8878a);
            g11.n(a13);
        }
        k1.r0 r0Var4 = (k1.r0) a13;
        Object a14 = com.huawei.hms.health.a.a(g11, 472939730);
        if (a14 == a.C0060a.a()) {
            a14 = androidx.compose.runtime.l0.f(InputFieldType.f33880h, androidx.compose.runtime.v0.f8878a);
            g11.n(a14);
        }
        k1.r0 r0Var5 = (k1.r0) a14;
        androidx.compose.ui.platform.k4 k4Var = (androidx.compose.ui.platform.k4) androidx.appcompat.view.menu.d.b(g11);
        g11.s(472939886);
        Object t12 = g11.t();
        if (t12 == a.C0060a.a()) {
            t12 = androidx.compose.runtime.l0.f(Boolean.FALSE, androidx.compose.runtime.v0.f8878a);
            g11.n(t12);
        }
        k1.r0 r0Var6 = (k1.r0) t12;
        g11.J();
        com.withings.wiscale2.account.password.r rVar2 = new com.withings.wiscale2.account.password.r(kotlin.collections.x.V(""));
        com.withings.wiscale2.settings.i iVar = (com.withings.wiscale2.settings.i) b10.getValue();
        g11.s(472939983);
        if (iVar instanceof i.b) {
            T value = b10.getValue();
            kotlin.jvm.internal.u.h(value, "null cannot be cast to non-null type com.withings.wiscale2.settings.CreatePasswordState.Error");
            Throwable a15 = ((i.b) value).a();
            if (a15 instanceof WrongOldPasswordException) {
                g11.s(472940196);
                onError.invoke(ay.b.u(C1987R.string._INCORRECT_OLD_PASSWORD_, g11));
                g11.J();
            } else if (a15 instanceof PasswordTooShortException) {
                g11.s(472940314);
                onError.invoke(ay.b.u(C1987R.string.passwordUpdate_passwordTooShort, g11));
                g11.J();
            } else if (a15 instanceof PasswordTooLongException) {
                g11.s(472940438);
                onError.invoke(ay.b.u(C1987R.string.account_password_error_tooLong, g11));
                g11.J();
            } else if ((a15 instanceof PasswordHasNoUppercaseException) || (a15 instanceof PasswordHasNoLowercaseException) || (a15 instanceof PasswordHasNoDigitException)) {
                g11.s(472940668);
                onError.invoke(ay.b.u(C1987R.string.passwordUpdate_passwordTooWeak, g11));
                g11.J();
            } else {
                g11.s(472940768);
                onError.invoke(ay.b.u(C1987R.string._WTA_GENERIC_ERROR_TITLE_, g11));
                g11.J();
            }
        } else if (kotlin.jvm.internal.u.e(iVar, i.d.f60040a)) {
            onNext.invoke();
        }
        g11.J();
        g11.s(472940966);
        if (((Boolean) r0Var6.getValue()).booleanValue()) {
            g11.s(472941047);
            Object t13 = g11.t();
            if (t13 == a.C0060a.a()) {
                t13 = new a(r0Var6);
                g11.n(t13);
            }
            ym0.a aVar2 = (ym0.a) t13;
            g11.J();
            String u11 = ay.b.u(C1987R.string._CHANGE_PASSWORD_, g11);
            String u12 = ay.b.u(C1987R.string._NO_VALID_MAIL_ADDRESS_ERROR_MESSAGE_, g11);
            String u13 = ay.b.u(C1987R.string._SEND_, g11);
            b bVar = new b(viewModel, onNext, r0Var6);
            String u14 = ay.b.u(C1987R.string._CANCEL_, g11);
            g11.s(472941599);
            Object t14 = g11.t();
            rVar = rVar2;
            if (t14 == a.C0060a.a()) {
                t14 = new c(r0Var6);
                g11.n(t14);
            }
            g11.J();
            wk.p.a(aVar2, u11, u12, u13, 0L, bVar, u14, 0L, (ym0.a) t14, g11, 100663302, ConstantsWs.MEASURE_TYPE_HR_LEVEL_MAX);
        } else {
            rVar = rVar2;
        }
        g11.J();
        yk.o.b(false, s1.b.b(g11, -2039134579, new d(onBack, r0Var3, b10, k4Var, viewModel, r0Var2, r0Var, r0Var5, r0Var4, rVar, r0Var6)), g11, 48, 1);
        androidx.compose.runtime.v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new e(viewModel, onBack, onNext, onError, i11));
        }
    }

    public static final void b(ym0.a<nm0.y> onConfirmClick, ym0.a<nm0.y> onCancelClick, androidx.compose.runtime.a aVar, int i11) {
        int i12;
        androidx.compose.ui.e b10;
        boolean z5;
        androidx.compose.ui.e b11;
        int i13;
        int i14;
        kotlin.jvm.internal.u.j(onConfirmClick, "onConfirmClick");
        kotlin.jvm.internal.u.j(onCancelClick, "onCancelClick");
        androidx.compose.runtime.b g11 = aVar.g(525399071);
        if ((i11 & 14) == 0) {
            if (g11.w(onConfirmClick)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i12 = i14 | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 112) == 0) {
            if (g11.w(onCancelClick)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i12 |= i13;
        }
        if ((i12 & 91) == 18 && g11.h()) {
            g11.C();
        } else {
            g11.s(-483455358);
            e.a aVar2 = androidx.compose.ui.e.f8927a;
            androidx.compose.ui.layout.l0 b12 = android.support.v4.media.session.c.b(androidx.compose.foundation.layout.e.h(), g11, -1323940314);
            int G = g11.G();
            k1.v0 l5 = g11.l();
            androidx.compose.ui.node.g.D.getClass();
            ym0.a a11 = g.a.a();
            s1.a c11 = androidx.compose.ui.layout.y.c(aVar2);
            if (g11.i() instanceof k1.d) {
                g11.A();
                if (g11.e()) {
                    g11.F(a11);
                } else {
                    g11.m();
                }
                ym0.p b13 = com.withings.authentication.e.b(g11, b12, g11, l5);
                if (g11.e() || !kotlin.jvm.internal.u.e(g11.t(), Integer.valueOf(G))) {
                    androidx.camera.camera2.internal.l0.d(G, g11, G, b13);
                }
                dq.x.b(0, c11, k1.j1.a(g11), g11, 2058660585);
                b10 = androidx.compose.foundation.c.b(androidx.compose.foundation.layout.e1.e(aVar2, 1.0f), ((androidx.compose.material3.i1) g11.D(androidx.compose.material3.j1.e())).O(), d2.h1.a());
                androidx.compose.ui.e g12 = androidx.compose.foundation.layout.x0.g(b10, yk.h.o(), yk.h.q());
                g11.s(-1010250582);
                if ((i12 & 112) == 32) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                Object t11 = g11.t();
                if (z5 || t11 == a.C0060a.a()) {
                    t11 = new f(onCancelClick);
                    g11.n(t11);
                }
                g11.J();
                nk.a.d(androidx.compose.foundation.h.b(g12, false, (ym0.a) t11, 7), ay.b.u(C1987R.string._CANCEL_, g11), ((androidx.compose.material3.i1) g11.D(androidx.compose.material3.j1.e())).J(), null, 0, 0, null, g11, 0, 120);
                androidx.compose.material.b2.a(0.0f, 0.0f, 0, 13, l1.a.a(g11, (yk.w) androidx.appcompat.app.h.b(g11, 615317871)), g11, null);
                b11 = androidx.compose.foundation.c.b(aVar2, ((androidx.compose.material3.i1) g11.D(androidx.compose.material3.j1.e())).O(), d2.h1.a());
                androidx.compose.ui.e g13 = androidx.compose.foundation.layout.x0.g(b11, yk.h.o(), yk.h.q());
                g11.s(-483455358);
                androidx.compose.ui.layout.l0 b14 = android.support.v4.media.session.c.b(androidx.compose.foundation.layout.e.h(), g11, -1323940314);
                int G2 = g11.G();
                k1.v0 l6 = g11.l();
                ym0.a a12 = g.a.a();
                s1.a c12 = androidx.compose.ui.layout.y.c(g13);
                if (g11.i() instanceof k1.d) {
                    g11.A();
                    if (g11.e()) {
                        g11.F(a12);
                    } else {
                        g11.m();
                    }
                    ym0.p b15 = com.withings.authentication.e.b(g11, b14, g11, l6);
                    if (g11.e() || !kotlin.jvm.internal.u.e(g11.t(), Integer.valueOf(G2))) {
                        androidx.camera.camera2.internal.l0.d(G2, g11, G2, b15);
                    }
                    dq.x.b(0, c12, k1.j1.a(g11), g11, 2058660585);
                    nk.a0.f(0, 0, 29, 0L, g11, null, null, ay.b.u(C1987R.string.settings_account_create_permanent_password, g11));
                    nk.a0.i(0, 0, 28, 0L, g11, androidx.compose.foundation.layout.x0.h(aVar2, 0.0f, yk.h.q(), 1), null, ay.b.u(C1987R.string.settings_account_create_permanent_password_subTitle, g11));
                    g11.J();
                    g11.o();
                    g11.J();
                    g11.J();
                    wk.i.a(null, false, s1.b.b(g11, 911450088, new g(onConfirmClick)), null, g11, ConstantsWs.WS_STATUS_LOGIN_UNAUTHORIZED, 11);
                    g9.a(g11);
                } else {
                    a3.g.s();
                    throw null;
                }
            } else {
                a3.g.s();
                throw null;
            }
        }
        androidx.compose.runtime.v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new h(onConfirmClick, onCancelClick, i11));
        }
    }

    public static final void c(SettingsViewModel viewModel, ym0.a<nm0.y> onPasswordCreated, ym0.a<nm0.y> onBack, ym0.l<? super String, nm0.y> onError, androidx.compose.runtime.a aVar, int i11) {
        kotlin.jvm.internal.u.j(viewModel, "viewModel");
        kotlin.jvm.internal.u.j(onPasswordCreated, "onPasswordCreated");
        kotlin.jvm.internal.u.j(onBack, "onBack");
        kotlin.jvm.internal.u.j(onError, "onError");
        androidx.compose.runtime.b g11 = aVar.g(-1067744357);
        k1.r0 b10 = t1.d.b(viewModel.A0(), i.a.f60037a, g11);
        g11.s(2086934338);
        Object t11 = g11.t();
        if (t11 == a.C0060a.a()) {
            t11 = androidx.compose.runtime.l0.f(Boolean.FALSE, androidx.compose.runtime.v0.f8878a);
            g11.n(t11);
        }
        k1.r0 r0Var = (k1.r0) t11;
        Object a11 = com.huawei.hms.health.a.a(g11, 2086934399);
        if (a11 == a.C0060a.a()) {
            a11 = androidx.compose.runtime.l0.f("", androidx.compose.runtime.v0.f8878a);
            g11.n(a11);
        }
        k1.r0 r0Var2 = (k1.r0) a11;
        Object a12 = com.huawei.hms.health.a.a(g11, 2086934460);
        if (a12 == a.C0060a.a()) {
            a12 = androidx.compose.runtime.l0.f(Boolean.FALSE, androidx.compose.runtime.v0.f8878a);
            g11.n(a12);
        }
        k1.r0 r0Var3 = (k1.r0) a12;
        androidx.compose.ui.platform.k4 k4Var = (androidx.compose.ui.platform.k4) androidx.appcompat.view.menu.d.b(g11);
        com.withings.wiscale2.account.password.r rVar = new com.withings.wiscale2.account.password.r(kotlin.collections.x.V(""));
        Object obj = (com.withings.wiscale2.settings.i) b10.getValue();
        if (obj == null) {
            obj = i.c.f60039a;
        }
        g11.s(2086934626);
        if (obj instanceof i.a) {
            r0Var.setValue(Boolean.FALSE);
        } else if (obj instanceof i.c) {
            r0Var.setValue(Boolean.TRUE);
        } else if (obj instanceof i.b) {
            r0Var.setValue(Boolean.FALSE);
            T value = b10.getValue();
            kotlin.jvm.internal.u.h(value, "null cannot be cast to non-null type com.withings.wiscale2.settings.CreatePasswordState.Error");
            Throwable a13 = ((i.b) value).a();
            if (a13 instanceof WrongOldPasswordException) {
                g11.s(2086935046);
                onError.invoke(ay.b.u(C1987R.string._INCORRECT_OLD_PASSWORD_, g11));
                g11.J();
            } else if (a13 instanceof PasswordTooShortException) {
                g11.s(2086935164);
                onError.invoke(ay.b.u(C1987R.string.passwordUpdate_passwordTooShort, g11));
                g11.J();
            } else if (a13 instanceof PasswordTooLongException) {
                g11.s(2086935288);
                onError.invoke(ay.b.u(C1987R.string.account_password_error_tooLong, g11));
                g11.J();
            } else if ((a13 instanceof PasswordHasNoUppercaseException) || (a13 instanceof PasswordHasNoLowercaseException) || (a13 instanceof PasswordHasNoDigitException)) {
                g11.s(2086935518);
                onError.invoke(ay.b.u(C1987R.string.passwordUpdate_passwordTooWeak, g11));
                g11.J();
            } else {
                g11.s(2086935618);
                onError.invoke(ay.b.u(C1987R.string._WTA_GENERIC_ERROR_TITLE_, g11));
                g11.J();
            }
        } else if (kotlin.jvm.internal.u.e(obj, i.d.f60040a)) {
            r0Var.setValue(Boolean.FALSE);
            onPasswordCreated.invoke();
        }
        g11.J();
        yk.o.b(false, s1.b.b(g11, -555150399, new i(onBack, rVar, r0Var2, r0Var3, k4Var, viewModel, r0Var)), g11, 48, 1);
        androidx.compose.runtime.v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new j(viewModel, onPasswordCreated, onBack, onError, i11));
        }
    }

    public static final void d(String title, b2.k focusRequester, com.withings.wiscale2.account.password.r passwordValidator, ym0.p<? super String, ? super String, nm0.y> onPasswordsChange, ym0.a<nm0.y> aVar, androidx.compose.runtime.a aVar2, int i11) {
        boolean z5;
        kotlin.jvm.internal.u.j(title, "title");
        kotlin.jvm.internal.u.j(focusRequester, "focusRequester");
        kotlin.jvm.internal.u.j(passwordValidator, "passwordValidator");
        kotlin.jvm.internal.u.j(onPasswordsChange, "onPasswordsChange");
        androidx.compose.runtime.b c11 = androidx.compose.material.g6.c(aVar, "onDone", aVar2, 213911927, -716070157);
        Object t11 = c11.t();
        if (t11 == a.C0060a.a()) {
            t11 = androidx.compose.runtime.l0.f("", androidx.compose.runtime.v0.f8878a);
            c11.n(t11);
        }
        k1.r0 r0Var = (k1.r0) t11;
        Object a11 = com.huawei.hms.health.a.a(c11, -716070093);
        if (a11 == a.C0060a.a()) {
            a11 = androidx.compose.runtime.l0.f("", androidx.compose.runtime.v0.f8878a);
            c11.n(a11);
        }
        k1.r0 r0Var2 = (k1.r0) a11;
        Object a12 = com.huawei.hms.health.a.a(c11, -716070033);
        if (a12 == a.C0060a.a()) {
            a12 = androidx.compose.runtime.l0.f(InputFieldType.f33880h, androidx.compose.runtime.v0.f8878a);
            c11.n(a12);
        }
        k1.r0 r0Var3 = (k1.r0) a12;
        Object a13 = com.huawei.hms.health.a.a(c11, -716069953);
        if (a13 == a.C0060a.a()) {
            a13 = androidx.compose.runtime.l0.f(InputFieldType.f33880h, androidx.compose.runtime.v0.f8878a);
            c11.n(a13);
        }
        k1.r0 r0Var4 = (k1.r0) a13;
        Object a14 = com.huawei.hms.health.a.a(c11, -716069861);
        if (a14 == a.C0060a.a()) {
            a14 = new b2.k();
            c11.n(a14);
        }
        b2.k kVar = (b2.k) a14;
        c11.J();
        e.a aVar3 = androidx.compose.ui.e.f8927a;
        androidx.compose.ui.e j5 = androidx.compose.foundation.layout.x0.j(aVar3, yk.h.o(), yk.h.t(), yk.h.o(), 0.0f, 8);
        String str = (String) r0Var.getValue();
        List a15 = com.withings.wiscale2.account.password.r.a((String) r0Var.getValue());
        c11.s(-716069594);
        int i12 = (i11 & 7168) ^ 3072;
        boolean z11 = true;
        if ((i12 > 2048 && c11.K(onPasswordsChange)) || (i11 & 3072) == 2048) {
            z5 = true;
        } else {
            z5 = false;
        }
        Object t12 = c11.t();
        if (z5 || t12 == a.C0060a.a()) {
            t12 = new k(r0Var, r0Var2, onPasswordsChange);
            c11.n(t12);
        }
        ym0.l lVar = (ym0.l) t12;
        Object a16 = com.huawei.hms.health.a.a(c11, -716069384);
        if (a16 == a.C0060a.a()) {
            a16 = new l(kVar);
            c11.n(a16);
        }
        c11.J();
        e(j5, title, r0Var3, str, null, lVar, focusRequester, 6, (ym0.a) a16, a15, c11, ((i11 << 3) & 112) | 1186988416 | ((i11 << 15) & 3670016), 16);
        String u11 = ay.b.u(C1987R.string._CONFIRM_PASSWORD_, c11);
        androidx.compose.ui.e j11 = androidx.compose.foundation.layout.x0.j(aVar3, yk.h.o(), yk.h.r(), yk.h.o(), 0.0f, 8);
        String str2 = (String) r0Var2.getValue();
        c11.s(-716068958);
        if ((i12 <= 2048 || !c11.K(onPasswordsChange)) && (i11 & 3072) != 2048) {
            z11 = false;
        }
        Object t13 = c11.t();
        if (z11 || t13 == a.C0060a.a()) {
            t13 = new m(r0Var2, r0Var, onPasswordsChange);
            c11.n(t13);
        }
        c11.J();
        e(j11, u11, r0Var4, str2, null, (ym0.l) t13, kVar, 7, aVar, null, c11, ((i11 << 12) & 234881024) | 14156160, ConstantsWs.WS_STATUS_ACCOUNT_DELETION_ERROR);
        androidx.compose.runtime.v o02 = c11.o0();
        if (o02 != null) {
            o02.G(new n(title, focusRequester, passwordValidator, onPasswordsChange, aVar, i11));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:125:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0128  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void e(androidx.compose.ui.e r30, java.lang.String r31, k1.r0<com.withings.common.compose.component.input.InputFieldType> r32, java.lang.String r33, java.lang.Integer r34, ym0.l<? super java.lang.String, nm0.y> r35, b2.k r36, int r37, ym0.a<nm0.y> r38, java.util.List<fk.t> r39, androidx.compose.runtime.a r40, int r41, int r42) {
        /*
            Method dump skipped, instructions count: 536
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.wiscale2.settings.l0.e(androidx.compose.ui.e, java.lang.String, k1.r0, java.lang.String, java.lang.Integer, ym0.l, b2.k, int, ym0.a, java.util.List, androidx.compose.runtime.a, int, int):void");
    }
}
