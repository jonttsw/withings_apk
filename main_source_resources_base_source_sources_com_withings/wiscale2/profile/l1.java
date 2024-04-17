package com.withings.wiscale2.profile;

import android.content.Context;
import com.withings.user.User;
import com.withings.wiscale2.C1987R;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
/* compiled from: ProfileViewModel.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.profile.UserDetailsLabelLiveData$reloadLabel$1$1", f = "ProfileViewModel.kt", l = {195, 196}, m = "invokeSuspend")
/* loaded from: classes5.dex */
final class l1 extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    Object f59397a;

    /* renamed from: b  reason: collision with root package name */
    int f59398b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ om.a f59399c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ i1 f59400d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ User f59401e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l1(om.a aVar, i1 i1Var, User user, qm0.d<? super l1> dVar) {
        super(2, dVar);
        this.f59399c = aVar;
        this.f59400d = i1Var;
        this.f59401e = user;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        return new l1(this.f59399c, this.f59400d, this.f59401e, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
        return ((l1) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        jm.a c11;
        CharSequence charSequence;
        Context context;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.f59398b;
        User user = this.f59401e;
        i1 i1Var = this.f59400d;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    charSequence = (CharSequence) this.f59397a;
                    nm0.l.b(obj);
                    int d11 = user.d();
                    context = i1Var.f59364b;
                    String string = context.getString(C1987R.string._YEARS_OLD_);
                    kotlin.jvm.internal.u.i(string, "getString(...)");
                    i1Var.postValue(d11 + " " + string + ", " + ((Object) ((CharSequence) obj)) + ", " + ((Object) charSequence) + ".");
                    return nm0.y.f85009a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c11 = (jm.a) this.f59397a;
            nm0.l.b(obj);
        } else {
            nm0.l.b(obj);
            c11 = this.f59399c.c();
            kotlin.jvm.internal.u.i(user, "$user");
            this.f59397a = c11;
            this.f59398b = 1;
            int i12 = i1.f59362g;
            i1Var.getClass();
            obj = BuildersKt.withContext(Dispatchers.getIO(), new k1(i1Var, user, c11, null), this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        CharSequence charSequence2 = (CharSequence) obj;
        kotlin.jvm.internal.u.i(user, "$user");
        this.f59397a = charSequence2;
        this.f59398b = 2;
        int i13 = i1.f59362g;
        i1Var.getClass();
        Object withContext = BuildersKt.withContext(Dispatchers.getIO(), new j1(i1Var, user, c11, null), this);
        if (withContext == coroutineSingletons) {
            return coroutineSingletons;
        }
        charSequence = charSequence2;
        obj = withContext;
        int d112 = user.d();
        context = i1Var.f59364b;
        String string2 = context.getString(C1987R.string._YEARS_OLD_);
        kotlin.jvm.internal.u.i(string2, "getString(...)");
        i1Var.postValue(d112 + " " + string2 + ", " + ((Object) ((CharSequence) obj)) + ", " + ((Object) charSequence) + ".");
        return nm0.y.f85009a;
    }
}
