package com.withings.tutorials.ui.screens;

import android.content.Context;
import android.content.Intent;
import android.webkit.URLUtil;
import android.widget.Toast;
import androidx.activity.result.ActivityResult;
import androidx.compose.foundation.layout.e1;
import androidx.compose.foundation.layout.x0;
import androidx.compose.material3.f8;
import androidx.compose.material3.g8;
import androidx.compose.material3.i1;
import androidx.compose.material3.j1;
import androidx.compose.runtime.a;
import androidx.compose.ui.platform.u0;
import androidx.lifecycle.d0;
import androidx.lifecycle.h1;
import b70.d1;
import b70.t0;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.huawei.hms.feature.dynamic.ModuleCopy;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.withings.device.Device;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.tutorials.ui.screens.SetupScaleForMultipleUsersViewModel;
import com.withings.wiscale2.C1987R;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import nk.g0;
import nm0.y;
import okhttp3.internal.http2.Http2;
import x1.b;
/* compiled from: MultipleUsers.kt */
/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f44812a = new Object();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MultipleUsers.kt */
    /* renamed from: com.withings.tutorials.ui.screens.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0621a extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ym0.a<y> f44813a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0621a(ym0.a<y> aVar) {
            super(2);
            this.f44813a = aVar;
        }

        @Override // ym0.p
        public final y invoke(androidx.compose.runtime.a aVar, Integer num) {
            androidx.compose.runtime.a aVar2 = aVar;
            if ((num.intValue() & 11) == 2 && aVar2.h()) {
                aVar2.C();
            } else {
                com.withings.common.compose.component.l.a(null, ay.b.u(C1987R.string._DONE_, aVar2), null, false, null, null, false, this.f44813a, aVar2, 0, 125);
            }
            return y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MultipleUsers.kt */
    /* loaded from: classes4.dex */
    public static final class b extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, y> {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ym0.a<y> f44815b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ym0.a<y> f44816c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f44817d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(ym0.a<y> aVar, ym0.a<y> aVar2, int i11) {
            super(2);
            this.f44815b = aVar;
            this.f44816c = aVar2;
            this.f44817d = i11;
        }

        @Override // ym0.p
        public final y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = ah.o.g(this.f44817d | 1);
            ym0.a<y> aVar2 = this.f44815b;
            ym0.a<y> aVar3 = this.f44816c;
            a.this.a(aVar2, aVar3, aVar, g11);
            return y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MultipleUsers.kt */
    /* loaded from: classes4.dex */
    public static final class c extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g2.c f44818a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f44819b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f44820c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ ym0.a<y> f44821d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(g2.c cVar, String str, String str2, ym0.a<y> aVar) {
            super(2);
            this.f44818a = cVar;
            this.f44819b = str;
            this.f44820c = str2;
            this.f44821d = aVar;
        }

        @Override // ym0.p
        public final y invoke(androidx.compose.runtime.a aVar, Integer num) {
            androidx.compose.runtime.a aVar2 = aVar;
            if ((num.intValue() & 11) == 2 && aVar2.h()) {
                aVar2.C();
            } else {
                com.withings.common.compose.component.o.j(x0.h(androidx.compose.ui.e.f8927a, yk.h.o(), 0.0f, 2), this.f44818a, null, null, this.f44819b, this.f44820c, false, false, true, b.a.l(), null, this.f44821d, aVar2, 905969728, 0, 1228);
            }
            return y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MultipleUsers.kt */
    /* loaded from: classes4.dex */
    public static final class d extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, y> {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ g2.c f44823b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f44824c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f44825d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ ym0.a<y> f44826e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ int f44827f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(g2.c cVar, String str, String str2, ym0.a<y> aVar, int i11) {
            super(2);
            this.f44823b = cVar;
            this.f44824c = str;
            this.f44825d = str2;
            this.f44826e = aVar;
            this.f44827f = i11;
        }

        @Override // ym0.p
        public final y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = ah.o.g(this.f44827f | 1);
            String str = this.f44825d;
            ym0.a<y> aVar2 = this.f44826e;
            a.this.b(this.f44823b, this.f44824c, str, aVar2, aVar, g11);
            return y.f85009a;
        }
    }

    /* compiled from: MultipleUsers.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002À\u0006\u0003"}, d2 = {"Lcom/withings/tutorials/ui/screens/a$e;", "", "ui_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public interface e {
        qn.a w();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MultipleUsers.kt */
    /* loaded from: classes4.dex */
    public static final class f extends kotlin.jvm.internal.w implements ym0.p<r8.m, r8.n, y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Device f44828a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ym0.a<y> f44829b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ym0.a<y> f44830c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ r8.n f44831d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(Device device, ym0.a<y> aVar, ym0.a<y> aVar2, r8.n nVar) {
            super(2);
            this.f44828a = device;
            this.f44829b = aVar;
            this.f44830c = aVar2;
            this.f44831d = nVar;
        }

        @Override // ym0.p
        public final y invoke(r8.m mVar, r8.n nVar) {
            r8.m GuidedPresentationTutorialNavHost = mVar;
            r8.n it = nVar;
            kotlin.jvm.internal.u.j(GuidedPresentationTutorialNavHost, "$this$GuidedPresentationTutorialNavHost");
            kotlin.jvm.internal.u.j(it, "it");
            r8.n nVar2 = this.f44831d;
            Device device = this.f44828a;
            ym0.a<y> aVar = this.f44829b;
            ym0.a<y> aVar2 = this.f44830c;
            androidx.navigation.compose.n.b(GuidedPresentationTutorialNavHost, "SetupScaleForMultipleUsers", null, null, null, null, null, null, new s1.a(true, 1201679139, new com.withings.tutorials.ui.screens.c(device, aVar, aVar2, nVar2)), 126);
            androidx.navigation.compose.n.b(GuidedPresentationTutorialNavHost, "HowToWeighYourBaby", null, null, null, null, null, null, new s1.a(true, -516147636, new com.withings.tutorials.ui.screens.d(aVar, aVar2)), 126);
            return y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MultipleUsers.kt */
    /* loaded from: classes4.dex */
    public static final class g extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, y> {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Device f44833b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ r8.n f44834c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ ym0.a<y> f44835d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ ym0.a<y> f44836e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ int f44837f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(Device device, r8.n nVar, ym0.a<y> aVar, ym0.a<y> aVar2, int i11) {
            super(2);
            this.f44833b = device;
            this.f44834c = nVar;
            this.f44835d = aVar;
            this.f44836e = aVar2;
            this.f44837f = i11;
        }

        @Override // ym0.p
        public final y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = ah.o.g(this.f44837f | 1);
            ym0.a<y> aVar2 = this.f44835d;
            ym0.a<y> aVar3 = this.f44836e;
            a.this.c(this.f44833b, this.f44834c, aVar2, aVar3, aVar, g11);
            return y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MultipleUsers.kt */
    /* loaded from: classes4.dex */
    public static final class h extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ym0.a<y> f44838a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(ym0.a<y> aVar) {
            super(2);
            this.f44838a = aVar;
        }

        @Override // ym0.p
        public final y invoke(androidx.compose.runtime.a aVar, Integer num) {
            androidx.compose.runtime.a aVar2 = aVar;
            if ((num.intValue() & 11) == 2 && aVar2.h()) {
                aVar2.C();
            } else {
                com.withings.common.compose.component.l.a(null, ay.b.u(C1987R.string._DONE_, aVar2), null, false, null, null, false, this.f44838a, aVar2, 0, 125);
            }
            return y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MultipleUsers.kt */
    /* loaded from: classes4.dex */
    public static final class i extends kotlin.jvm.internal.w implements ym0.q<r0.h, androidx.compose.runtime.a, Integer, y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ym0.a<y> f44839a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ym0.a<y> f44840b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Context f44841c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(ym0.a<y> aVar, ym0.a<y> aVar2, Context context) {
            super(3);
            this.f44839a = aVar;
            this.f44840b = aVar2;
            this.f44841c = context;
        }

        @Override // ym0.q
        public final y invoke(r0.h hVar, androidx.compose.runtime.a aVar, Integer num) {
            r0.h VideoTutorialScreen = hVar;
            androidx.compose.runtime.a aVar2 = aVar;
            int intValue = num.intValue();
            kotlin.jvm.internal.u.j(VideoTutorialScreen, "$this$VideoTutorialScreen");
            if ((intValue & 81) == 16 && aVar2.h()) {
                aVar2.C();
            } else {
                nk.a.d(null, ay.b.u(C1987R.string.multipleUsers_tutorial_description, aVar2), 0L, null, 0, 0, null, aVar2, 0, 125);
                String u11 = ay.b.u(C1987R.string.multipleUsers_tutorial_note_learnMore_url, aVar2);
                nk.a.h(0, 0, 28, 0L, aVar2, androidx.compose.foundation.h.b(androidx.compose.ui.e.f8927a, URLUtil.isValidUrl(u11), new com.withings.tutorials.ui.screens.e(this.f44841c, u11), 6), g0.a(((i1) aVar2.D(j1.e())).J(), ay.b.u(C1987R.string.multipleUsers_tutorial_note, aVar2)), null);
                a aVar3 = a.f44812a;
                aVar3.b(s2.d.a(C1987R.drawable.advanced_icon_invite, aVar2), ay.b.u(C1987R.string.multipleUsers_tutorial_shareYourScale_item1_title, aVar2), ay.b.u(C1987R.string.multipleUsers_tutorial_shareYourScale_item1_description, aVar2), this.f44839a, aVar2, 24584);
                aVar3.b(s2.d.a(C1987R.drawable.advanced_icon_child, aVar2), ay.b.u(C1987R.string.multipleUsers_tutorial_shareYourScale_item2_title, aVar2), ay.b.u(C1987R.string.multipleUsers_tutorial_shareYourScale_item2_description, aVar2), this.f44840b, aVar2, 24584);
            }
            return y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MultipleUsers.kt */
    /* loaded from: classes4.dex */
    public static final class j extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, y> {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f44843b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Integer f44844c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ ym0.a<y> f44845d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ ym0.a<y> f44846e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ ym0.a<y> f44847f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ ym0.a<y> f44848g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ int f44849h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(String str, Integer num, ym0.a<y> aVar, ym0.a<y> aVar2, ym0.a<y> aVar3, ym0.a<y> aVar4, int i11) {
            super(2);
            this.f44843b = str;
            this.f44844c = num;
            this.f44845d = aVar;
            this.f44846e = aVar2;
            this.f44847f = aVar3;
            this.f44848g = aVar4;
            this.f44849h = i11;
        }

        @Override // ym0.p
        public final y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = ah.o.g(this.f44849h | 1);
            ym0.a<y> aVar2 = this.f44847f;
            ym0.a<y> aVar3 = this.f44848g;
            a.this.d(this.f44843b, this.f44844c, this.f44845d, this.f44846e, aVar2, aVar3, aVar, g11);
            return y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MultipleUsers.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.tutorials.ui.screens.MultipleUsers$SetupTheScaleForMultipleUsersWithRedirections$1", f = "MultipleUsers.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class k extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ SetupScaleForMultipleUsersViewModel f44850a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ d0 f44851b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Context f44852c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ e f44853d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ Device f44854e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ ym0.a<y> f44855f;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: MultipleUsers.kt */
        /* renamed from: com.withings.tutorials.ui.screens.a$k$a  reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0622a extends kotlin.jvm.internal.w implements ym0.l<SetupScaleForMultipleUsersViewModel.a, y> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ Context f44856a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ e f44857b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ Device f44858c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ ym0.a<y> f44859d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0622a(Context context, e eVar, Device device, ym0.a<y> aVar) {
                super(1);
                this.f44856a = context;
                this.f44857b = eVar;
                this.f44858c = device;
                this.f44859d = aVar;
            }

            @Override // ym0.l
            public final y invoke(SetupScaleForMultipleUsersViewModel.a aVar) {
                SetupScaleForMultipleUsersViewModel.a event = aVar;
                kotlin.jvm.internal.u.j(event, "event");
                boolean z5 = event instanceof SetupScaleForMultipleUsersViewModel.a.b;
                Context context = this.f44856a;
                if (z5) {
                    u70.e.e(b50.b.c(context), this.f44857b.w().a(context, this.f44858c, ((SetupScaleForMultipleUsersViewModel.a.b) event).a()));
                } else if (event instanceof SetupScaleForMultipleUsersViewModel.a.d) {
                    Toast.makeText(context, (int) C1987R.string._INTERNET_NEEDED_TEXT_, 0).show();
                } else if ((event instanceof SetupScaleForMultipleUsersViewModel.a.C0620a) || (event instanceof SetupScaleForMultipleUsersViewModel.a.c)) {
                    Toast.makeText(context, (int) C1987R.string._ERROR_, 0).show();
                } else if (event instanceof SetupScaleForMultipleUsersViewModel.a.e) {
                    this.f44859d.invoke();
                }
                return y.f85009a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(SetupScaleForMultipleUsersViewModel setupScaleForMultipleUsersViewModel, d0 d0Var, Context context, e eVar, Device device, ym0.a<y> aVar, qm0.d<? super k> dVar) {
            super(2, dVar);
            this.f44850a = setupScaleForMultipleUsersViewModel;
            this.f44851b = d0Var;
            this.f44852c = context;
            this.f44853d = eVar;
            this.f44854e = device;
            this.f44855f = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
            return new k(this.f44850a, this.f44851b, this.f44852c, this.f44853d, this.f44854e, this.f44855f, dVar);
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super y> dVar) {
            return ((k) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            nm0.l.b(obj);
            this.f44850a.k0().observe(this.f44851b, new com.withings.tutorials.ui.screens.f(new C0622a(this.f44852c, this.f44853d, this.f44854e, this.f44855f)));
            return y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MultipleUsers.kt */
    /* loaded from: classes4.dex */
    public static final class l extends kotlin.jvm.internal.w implements ym0.a<y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ SetupScaleForMultipleUsersViewModel f44860a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Device f44861b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(SetupScaleForMultipleUsersViewModel setupScaleForMultipleUsersViewModel, Device device) {
            super(0);
            this.f44860a = setupScaleForMultipleUsersViewModel;
            this.f44861b = device;
        }

        @Override // ym0.a
        public final y invoke() {
            SetupScaleForMultipleUsersViewModel setupScaleForMultipleUsersViewModel = this.f44860a;
            setupScaleForMultipleUsersViewModel.getClass();
            Device device = this.f44861b;
            kotlin.jvm.internal.u.j(device, "device");
            BuildersKt__Builders_commonKt.launch$default(h1.a(setupScaleForMultipleUsersViewModel), null, null, new w(setupScaleForMultipleUsersViewModel, device, null), 3, null);
            return y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MultipleUsers.kt */
    /* loaded from: classes4.dex */
    public static final class m extends kotlin.jvm.internal.w implements ym0.a<y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e.n<Intent, ActivityResult> f44862a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Context f44863b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m(e.n<Intent, ActivityResult> nVar, Context context) {
            super(0);
            this.f44862a = nVar;
            this.f44863b = context;
        }

        @Override // ym0.a
        public final y invoke() {
            Context context = this.f44863b;
            Intent className = androidx.fragment.app.o.b(context, ConstantsWs.JSON_ACCOUNT_KEY_CONTEXT, CommonConstant.ACTION.HWID_SCHEME_URL).setClassName(context.getPackageName(), "com.withings.wiscale2.user.ui.CreateUserActivity");
            kotlin.jvm.internal.u.i(className, "setClassName(...)");
            this.f44862a.a(className);
            return y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MultipleUsers.kt */
    /* loaded from: classes4.dex */
    public static final class n extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, y> {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ SetupScaleForMultipleUsersViewModel f44865b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Device f44866c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ ym0.a<y> f44867d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ ym0.a<y> f44868e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ ym0.a<y> f44869f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ int f44870g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(SetupScaleForMultipleUsersViewModel setupScaleForMultipleUsersViewModel, Device device, ym0.a<y> aVar, ym0.a<y> aVar2, ym0.a<y> aVar3, int i11) {
            super(2);
            this.f44865b = setupScaleForMultipleUsersViewModel;
            this.f44866c = device;
            this.f44867d = aVar;
            this.f44868e = aVar2;
            this.f44869f = aVar3;
            this.f44870g = i11;
        }

        @Override // ym0.p
        public final y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = ah.o.g(this.f44870g | 1);
            ym0.a<y> aVar2 = this.f44868e;
            ym0.a<y> aVar3 = this.f44869f;
            a.this.e(this.f44865b, this.f44866c, this.f44867d, aVar2, aVar3, aVar, g11);
            return y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MultipleUsers.kt */
    /* loaded from: classes4.dex */
    public static final class o extends kotlin.jvm.internal.w implements ym0.l<ActivityResult, y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ SetupScaleForMultipleUsersViewModel f44871a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        o(SetupScaleForMultipleUsersViewModel setupScaleForMultipleUsersViewModel) {
            super(1);
            this.f44871a = setupScaleForMultipleUsersViewModel;
        }

        @Override // ym0.l
        public final y invoke(ActivityResult activityResult) {
            ActivityResult result = activityResult;
            kotlin.jvm.internal.u.j(result, "result");
            if (result.b() == -1) {
                SetupScaleForMultipleUsersViewModel setupScaleForMultipleUsersViewModel = this.f44871a;
                setupScaleForMultipleUsersViewModel.getClass();
                BuildersKt__Builders_commonKt.launch$default(h1.a(setupScaleForMultipleUsersViewModel), Dispatchers.getIO(), null, new v(setupScaleForMultipleUsersViewModel, null), 2, null);
            }
            return y.f85009a;
        }
    }

    public final void a(ym0.a<y> onBackClicked, ym0.a<y> onNextClicked, androidx.compose.runtime.a aVar, int i11) {
        int i12;
        int i13;
        int i14;
        kotlin.jvm.internal.u.j(onBackClicked, "onBackClicked");
        kotlin.jvm.internal.u.j(onNextClicked, "onNextClicked");
        androidx.compose.runtime.b g11 = aVar.g(-1801445166);
        if ((i11 & 14) == 0) {
            if (g11.w(onBackClicked)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i12 = i14 | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 112) == 0) {
            if (g11.w(onNextClicked)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i12 |= i13;
        }
        if ((i12 & 91) == 18 && g11.h()) {
            g11.C();
        } else {
            String u11 = ay.b.u(C1987R.string.multipleUsers_tutorial_howWeighinBaby_title, g11);
            t0.h(s1.b.b(g11, -1749953812, new C0621a(onNextClicked)), ay.b.u(C1987R.string.deviceInstallation_ariane_wbs12_howToWeightYourBaby_video_url, g11), onBackClicked, s2.d.a(2131232417, g11), u11, null, 0.0f, b70.c.f20466a, g11, ((i12 << 6) & ConstantsWs.HWFAILURE_ZERO) | 12587014, 96);
        }
        androidx.compose.runtime.v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new b(onBackClicked, onNextClicked, i11));
        }
    }

    public final void b(g2.c imagePainter, String labelText, String captionText, ym0.a<y> onClick, androidx.compose.runtime.a aVar, int i11) {
        kotlin.jvm.internal.u.j(imagePainter, "imagePainter");
        kotlin.jvm.internal.u.j(labelText, "labelText");
        kotlin.jvm.internal.u.j(captionText, "captionText");
        kotlin.jvm.internal.u.j(onClick, "onClick");
        androidx.compose.runtime.b g11 = aVar.g(1242717603);
        androidx.compose.material.x0.a(e1.e(androidx.compose.ui.e.f8927a, 1.0f), ((f8) g11.D(g8.a())).d(), ((i1) g11.D(j1.e())).a(), 0, s1.b.b(g11, -541762464, new c(imagePainter, labelText, captionText, onClick)), g11, 1769478, 24);
        androidx.compose.runtime.v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new d(imagePainter, labelText, captionText, onClick, i11));
        }
    }

    public final void c(Device device, r8.n navController, ym0.a<y> onBack, ym0.a<y> onDone, androidx.compose.runtime.a aVar, int i11) {
        kotlin.jvm.internal.u.j(device, "device");
        kotlin.jvm.internal.u.j(navController, "navController");
        kotlin.jvm.internal.u.j(onBack, "onBack");
        kotlin.jvm.internal.u.j(onDone, "onDone");
        androidx.compose.runtime.b g11 = aVar.g(-1959452501);
        t0.b(navController, "SetupScaleForMultipleUsers", new f(device, onBack, onDone, navController), g11, 56);
        androidx.compose.runtime.v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new g(device, navController, onBack, onDone, i11));
        }
    }

    public final void d(String str, Integer num, ym0.a<y> onBackClicked, ym0.a<y> onNextClicked, ym0.a<y> shareLinkToScale, ym0.a<y> addSecondaryUser, androidx.compose.runtime.a aVar, int i11) {
        int i12;
        androidx.compose.runtime.b bVar;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        kotlin.jvm.internal.u.j(onBackClicked, "onBackClicked");
        kotlin.jvm.internal.u.j(onNextClicked, "onNextClicked");
        kotlin.jvm.internal.u.j(shareLinkToScale, "shareLinkToScale");
        kotlin.jvm.internal.u.j(addSecondaryUser, "addSecondaryUser");
        androidx.compose.runtime.b g11 = aVar.g(111988121);
        if ((i11 & 14) == 0) {
            if (g11.K(str)) {
                i19 = 4;
            } else {
                i19 = 2;
            }
            i12 = i19 | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 112) == 0) {
            if (g11.K(num)) {
                i18 = 32;
            } else {
                i18 = 16;
            }
            i12 |= i18;
        }
        if ((i11 & ConstantsWs.HWFAILURE_ZERO) == 0) {
            if (g11.w(onBackClicked)) {
                i17 = 256;
            } else {
                i17 = 128;
            }
            i12 |= i17;
        }
        if ((i11 & 7168) == 0) {
            if (g11.w(onNextClicked)) {
                i16 = ModuleCopy.f28574b;
            } else {
                i16 = 1024;
            }
            i12 |= i16;
        }
        if ((57344 & i11) == 0) {
            if (g11.w(shareLinkToScale)) {
                i15 = Http2.INITIAL_MAX_FRAME_SIZE;
            } else {
                i15 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
            }
            i12 |= i15;
        }
        if ((458752 & i11) == 0) {
            if (g11.w(addSecondaryUser)) {
                i14 = 131072;
            } else {
                i14 = 65536;
            }
            i12 |= i14;
        }
        if ((374491 & i12) == 74898 && g11.h()) {
            g11.C();
            bVar = g11;
        } else {
            Context context = (Context) g11.D(u0.d());
            g11.s(2007752627);
            d1 t11 = g11.t();
            if (t11 == a.C0060a.a()) {
                if (num != null && num.intValue() == 10 && kotlin.jvm.internal.u.e(str, ConstantsWs.DEVICE_COLOR_WHITE)) {
                    t11 = new d1(C1987R.string.deviceInstallation_ariane_wbs08_multipleUsers_video_w_url, 2131232414);
                } else if (num != null && num.intValue() == 10) {
                    t11 = new d1(C1987R.string.deviceInstallation_ariane_wbs08_multipleUsers_video_b_url, 2131232409);
                } else if (kotlin.jvm.internal.u.e(str, ConstantsWs.DEVICE_COLOR_WHITE)) {
                    if (num != null && num.intValue() == 18) {
                        i13 = C1987R.string.deviceInstallation_ariane_wbs12c_wbs13_multipleUsers_video_w_url;
                    } else {
                        i13 = C1987R.string.deviceInstallation_ariane_wbs12_multipleUsers_video_w_url;
                    }
                    t11 = new d1(i13, 2131232416);
                } else if (kotlin.jvm.internal.u.e(str, ConstantsWs.DEVICE_COLOR_BLACK) && num != null && num.intValue() == 18) {
                    t11 = new d1(C1987R.string.deviceInstallation_ariane_wbs12c_wbs13_multipleUsers_video_b_url, 2131232415);
                } else {
                    t11 = new d1(C1987R.string.deviceInstallation_ariane_wbs12_multipleUsers_video_b_url, 2131232415);
                }
                g11.n(t11);
            }
            d1 d1Var = (d1) t11;
            g11.J();
            String u11 = ay.b.u(C1987R.string.multipleUsers_tutorial_title, g11);
            bVar = g11;
            t0.h(s1.b.b(g11, 1814380339, new h(onNextClicked)), ay.b.u(d1Var.a(), g11), onBackClicked, s2.d.a(d1Var.b(), g11), u11, null, 0.0f, s1.b.b(g11, -1087823492, new i(shareLinkToScale, addSecondaryUser, context)), g11, (i12 & ConstantsWs.HWFAILURE_ZERO) | 12587014, 96);
        }
        androidx.compose.runtime.v o02 = bVar.o0();
        if (o02 != null) {
            o02.G(new j(str, num, onBackClicked, onNextClicked, shareLinkToScale, addSecondaryUser, i11));
        }
    }

    public final void e(SetupScaleForMultipleUsersViewModel viewModel, Device device, ym0.a<y> onBackClicked, ym0.a<y> onNextClicked, ym0.a<y> onGoToHowToWeighYourBaby, androidx.compose.runtime.a aVar, int i11) {
        kotlin.jvm.internal.u.j(viewModel, "viewModel");
        kotlin.jvm.internal.u.j(device, "device");
        kotlin.jvm.internal.u.j(onBackClicked, "onBackClicked");
        kotlin.jvm.internal.u.j(onNextClicked, "onNextClicked");
        kotlin.jvm.internal.u.j(onGoToHowToWeighYourBaby, "onGoToHowToWeighYourBaby");
        androidx.compose.runtime.b g11 = aVar.g(-816041376);
        Context applicationContext = ((Context) g11.D(u0.d())).getApplicationContext();
        kotlin.jvm.internal.u.i(applicationContext, "getApplicationContext(...)");
        e eVar = (e) ah.o.c(applicationContext, e.class);
        e.n a11 = e.d.a(new g.a(), new o(viewModel), g11, 8);
        Context context = (Context) g11.D(u0.d());
        k1.y.f(Long.valueOf(device.getId()), new k(viewModel, (d0) g11.D(u0.f()), context, eVar, device, onGoToHowToWeighYourBaby, null), g11);
        d(device.getColor(), Integer.valueOf(device.getModelId()), onBackClicked, onNextClicked, new l(viewModel, device), new m(a11, context), g11, (i11 & ConstantsWs.HWFAILURE_ZERO) | (i11 & 7168) | ((i11 << 3) & 3670016));
        androidx.compose.runtime.v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new n(viewModel, device, onBackClicked, onNextClicked, onGoToHowToWeighYourBaby, i11));
        }
    }
}
