package com.withings.wiscale2.user.ui.profile;

import android.content.Context;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.user.User;
import com.withings.user.core.models.User;
import com.withings.webservices.legacy.withings.model.ImagesP4;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: EditProfileViewModel.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.user.ui.profile.EditProfileViewModel$onPictureUploaded$1", f = "EditProfileViewModel.kt", l = {ConstantsWs.WS_STATUS_WRONGCSVONLY, ConstantsWs.WS_STATUS_NOT_FIRST_USER, ConstantsWs.WS_STATUS_DEACTIVATED_DEVUSER}, m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class l0 extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f61985a;

    /* renamed from: b  reason: collision with root package name */
    private /* synthetic */ Object f61986b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ s0 f61987c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ User f61988d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ User.Images f61989e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: EditProfileViewModel.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.user.ui.profile.EditProfileViewModel$onPictureUploaded$1$1$1", f = "EditProfileViewModel.kt", l = {ConstantsWs.WS_STATUS_WRONGNOTIFICATION}, m = "invokeSuspend")
    /* loaded from: classes5.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f61990a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ s0 f61991b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ com.withings.user.User f61992c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ User.Images f61993d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(s0 s0Var, com.withings.user.User user, User.Images images, qm0.d<? super a> dVar) {
            super(2, dVar);
            this.f61991b = s0Var;
            this.f61992c = user;
            this.f61993d = images;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
            return new a(this.f61991b, this.f61992c, this.f61993d, dVar);
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
            return ((a) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Context context;
            q70.j jVar;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            int i11 = this.f61990a;
            if (i11 != 0) {
                if (i11 == 1) {
                    nm0.l.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                nm0.l.b(obj);
                s0 s0Var = this.f61991b;
                context = s0Var.f62042c;
                z9.a c11 = w9.a.a(context).c();
                if (c11 != null) {
                    c11.clear();
                }
                User.Images images = this.f61993d;
                kotlin.jvm.internal.u.j(images, "<this>");
                ImagesP4 imagesP4 = new ImagesP4();
                imagesP4.image32 = images.getSize32();
                imagesP4.image64 = images.getSize64();
                imagesP4.image128 = images.getSize128();
                imagesP4.image256 = images.getSize256();
                imagesP4.image512 = images.getSize512();
                com.withings.user.User user = this.f61992c;
                user.l0(imagesP4);
                jVar = s0Var.f62049j;
                com.withings.user.core.models.User d11 = o70.a.d(user);
                this.f61990a = 1;
                if (jVar.c(d11, "edit_profile_on_picture_uploaded", this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(s0 s0Var, com.withings.user.User user, User.Images images, qm0.d<? super l0> dVar) {
        super(2, dVar);
        this.f61987c = s0Var;
        this.f61988d = user;
        this.f61989e = images;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        l0 l0Var = new l0(this.f61987c, this.f61988d, this.f61989e, dVar);
        l0Var.f61986b = obj;
        return l0Var;
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
        return ((l0) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0090  */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
            int r1 = r9.f61985a
            r2 = 3
            r3 = 2
            com.withings.wiscale2.user.ui.profile.s0 r4 = r9.f61987c
            r5 = 1
            if (r1 == 0) goto L2a
            if (r1 == r5) goto L24
            if (r1 == r3) goto L1e
            if (r1 != r2) goto L16
            nm0.l.b(r10)
            goto La7
        L16:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L1e:
            java.lang.Object r1 = r9.f61986b
            nm0.l.b(r10)
            goto L8a
        L24:
            nm0.l.b(r10)     // Catch: java.lang.Throwable -> L28
            goto L59
        L28:
            r10 = move-exception
            goto L5d
        L2a:
            nm0.l.b(r10)
            java.lang.Object r10 = r9.f61986b
            kotlinx.coroutines.CoroutineScope r10 = (kotlinx.coroutines.CoroutineScope) r10
            com.withings.user.User r10 = r9.f61988d
            com.withings.user.core.models.User$Images r1 = r9.f61989e
            android.content.Context r6 = com.withings.wiscale2.user.ui.profile.s0.j0(r4)     // Catch: java.lang.Throwable -> L28
            w9.g r6 = w9.a.a(r6)     // Catch: java.lang.Throwable -> L28
            coil.memory.MemoryCache r6 = r6.e()     // Catch: java.lang.Throwable -> L28
            if (r6 == 0) goto L46
            r6.clear()     // Catch: java.lang.Throwable -> L28
        L46:
            kotlinx.coroutines.CoroutineDispatcher r6 = kotlinx.coroutines.Dispatchers.getIO()     // Catch: java.lang.Throwable -> L28
            com.withings.wiscale2.user.ui.profile.l0$a r7 = new com.withings.wiscale2.user.ui.profile.l0$a     // Catch: java.lang.Throwable -> L28
            r8 = 0
            r7.<init>(r4, r10, r1, r8)     // Catch: java.lang.Throwable -> L28
            r9.f61985a = r5     // Catch: java.lang.Throwable -> L28
            java.lang.Object r10 = kotlinx.coroutines.BuildersKt.withContext(r6, r7, r9)     // Catch: java.lang.Throwable -> L28
            if (r10 != r0) goto L59
            return r0
        L59:
            nm0.y r10 = nm0.y.f85009a     // Catch: java.lang.Throwable -> L28
        L5b:
            r1 = r10
            goto L62
        L5d:
            nm0.k$a r10 = nm0.l.a(r10)
            goto L5b
        L62:
            boolean r10 = r1 instanceof nm0.k.a
            r10 = r10 ^ r5
            if (r10 == 0) goto L8a
            r10 = r1
            nm0.y r10 = (nm0.y) r10
            kotlinx.coroutines.flow.MutableStateFlow r10 = r4.X0()
            java.lang.Boolean r5 = java.lang.Boolean.TRUE
            r10.setValue(r5)
            kotlinx.coroutines.flow.MutableSharedFlow r10 = r4.a1()
            java.lang.Integer r5 = new java.lang.Integer
            r6 = 2132018734(0x7f14062e, float:1.9675783E38)
            r5.<init>(r6)
            r9.f61986b = r1
            r9.f61985a = r3
            java.lang.Object r10 = r10.emit(r5, r9)
            if (r10 != r0) goto L8a
            return r0
        L8a:
            java.lang.Throwable r10 = nm0.k.b(r1)
            if (r10 == 0) goto La7
            kotlinx.coroutines.flow.MutableSharedFlow r10 = r4.a1()
            java.lang.Integer r3 = new java.lang.Integer
            r4 = 2132017667(0x7f140203, float:1.9673619E38)
            r3.<init>(r4)
            r9.f61986b = r1
            r9.f61985a = r2
            java.lang.Object r10 = r10.emit(r3, r9)
            if (r10 != r0) goto La7
            return r0
        La7:
            nm0.y r10 = nm0.y.f85009a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.wiscale2.user.ui.profile.l0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
