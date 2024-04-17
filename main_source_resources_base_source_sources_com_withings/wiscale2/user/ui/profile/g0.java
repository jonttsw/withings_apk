package com.withings.wiscale2.user.ui.profile;

import android.net.Uri;
import androidx.lifecycle.h1;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.user.core.models.User;
import java.io.File;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
import va0.d;
/* compiled from: EditProfileViewModel.kt */
/* loaded from: classes5.dex */
public final class g0 implements d.a {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ s0 f61952a;

    /* compiled from: EditProfileViewModel.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.user.ui.profile.EditProfileViewModel$1$onPhotoPicked$1", f = "EditProfileViewModel.kt", l = {ConstantsWs.MEASURE_TYPE_VA_REACHED_COUNT}, m = "invokeSuspend")
    /* loaded from: classes5.dex */
    static final class a extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        String f61953a;

        /* renamed from: b  reason: collision with root package name */
        int f61954b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Uri f61955c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ s0 f61956d;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: EditProfileViewModel.kt */
        /* renamed from: com.withings.wiscale2.user.ui.profile.g0$a$a  reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        public static final class C0786a extends kotlin.jvm.internal.w implements ym0.p<String, User, nm0.y> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ s0 f61957a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0786a(s0 s0Var) {
                super(2);
                this.f61957a = s0Var;
            }

            @Override // ym0.p
            public final nm0.y invoke(String str, User user) {
                String path = str;
                User user2 = user;
                kotlin.jvm.internal.u.j(path, "path");
                kotlin.jvm.internal.u.j(user2, "user");
                s0.M0(this.f61957a, o70.a.e(user2), new File(path));
                return nm0.y.f85009a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Uri uri, s0 s0Var, qm0.d<? super a> dVar) {
            super(2, dVar);
            this.f61955c = uri;
            this.f61956d = s0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
            return new a(this.f61955c, this.f61956d, dVar);
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
            return ((a) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            String str;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            int i11 = this.f61954b;
            s0 s0Var = this.f61956d;
            if (i11 != 0) {
                if (i11 == 1) {
                    str = this.f61953a;
                    nm0.l.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                nm0.l.b(obj);
                String path = this.f61955c.getPath();
                SharedFlow<User> c12 = s0Var.c1();
                this.f61953a = path;
                this.f61954b = 1;
                Object first = FlowKt.first(c12, this);
                if (first == coroutineSingletons) {
                    return coroutineSingletons;
                }
                str = path;
                obj = first;
            }
            cr.a.a(new nm0.j(str, obj), new C0786a(s0Var));
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public g0(s0 s0Var) {
        this.f61952a = s0Var;
    }

    @Override // va0.d.a
    public final void M(Uri uri) {
        s0 s0Var = this.f61952a;
        BuildersKt__Builders_commonKt.launch$default(h1.a(s0Var), null, null, new a(uri, s0Var, null), 3, null);
    }
}
