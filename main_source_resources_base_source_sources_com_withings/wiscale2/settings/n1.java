package com.withings.wiscale2.settings;

import com.withings.user.core.models.User;
import com.withings.wiscale2.user.ui.profile.EditProfileActivity;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.FlowKt;
/* compiled from: SettingsActivity.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.settings.SettingsActivity$AccountSection$1$2$1", f = "SettingsActivity.kt", l = {609}, m = "invokeSuspend")
/* loaded from: classes5.dex */
final class n1 extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f60202a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ SettingsActivity f60203b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SettingsActivity.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.settings.SettingsActivity$AccountSection$1$2$1$user$1", f = "SettingsActivity.kt", l = {609}, m = "invokeSuspend")
    /* loaded from: classes5.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super User>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f60204a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ SettingsActivity f60205b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(SettingsActivity settingsActivity, qm0.d<? super a> dVar) {
            super(2, dVar);
            this.f60205b = settingsActivity;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
            return new a(this.f60205b, dVar);
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super User> dVar) {
            return ((a) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            int i11 = this.f60204a;
            if (i11 != 0) {
                if (i11 == 1) {
                    nm0.l.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                nm0.l.b(obj);
                r70.c cVar = this.f60205b.f59745f;
                if (cVar != null) {
                    this.f60204a = 1;
                    obj = FlowKt.first(FlowKt.filterNotNull(cVar.f()), this);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    kotlin.jvm.internal.u.s("userRepository");
                    throw null;
                }
            }
            return obj;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n1(SettingsActivity settingsActivity, qm0.d<? super n1> dVar) {
        super(2, dVar);
        this.f60203b = settingsActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        return new n1(this.f60203b, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
        return ((n1) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.f60202a;
        SettingsActivity settingsActivity = this.f60203b;
        if (i11 != 0) {
            if (i11 == 1) {
                nm0.l.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            nm0.l.b(obj);
            CoroutineDispatcher io2 = Dispatchers.getIO();
            a aVar = new a(settingsActivity, null);
            this.f60202a = 1;
            obj = BuildersKt.withContext(io2, aVar, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        EditProfileActivity.a aVar2 = EditProfileActivity.f61841i;
        long id2 = ((User) obj).getId();
        aVar2.getClass();
        settingsActivity.startActivity(EditProfileActivity.a.a(settingsActivity, id2, false));
        return nm0.y.f85009a;
    }
}
