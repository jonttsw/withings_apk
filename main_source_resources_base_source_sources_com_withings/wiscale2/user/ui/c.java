package com.withings.wiscale2.user.ui;

import android.app.ProgressDialog;
import android.content.Intent;
import androidx.core.app.h0;
import com.withings.authentication.AuthenticationActivity;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.wiscale2.C1987R;
import com.withings.wiscale2.settings.k0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: CreateUserActivity.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.user.ui.CreateUserActivity$logout$1", f = "CreateUserActivity.kt", l = {ConstantsWs.MEASURE_TYPE_ABORTED_WEIGHT}, m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class c extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    ProgressDialog f61823a;

    /* renamed from: b  reason: collision with root package name */
    int f61824b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ CreateUserActivity f61825c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CreateUserActivity.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.user.ui.CreateUserActivity$logout$1$1", f = "CreateUserActivity.kt", l = {135}, m = "invokeSuspend")
    /* loaded from: classes5.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f61826a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ CreateUserActivity f61827b;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: CreateUserActivity.kt */
        /* renamed from: com.withings.wiscale2.user.ui.c$a$a  reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        public static final class C0783a extends kotlin.jvm.internal.w implements ym0.l<qf.b, nm0.y> {

            /* renamed from: a  reason: collision with root package name */
            public static final C0783a f61828a = new kotlin.jvm.internal.w(1);

            @Override // ym0.l
            public final nm0.y invoke(qf.b bVar) {
                qf.b it = bVar;
                kotlin.jvm.internal.u.j(it, "it");
                return nm0.y.f85009a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(CreateUserActivity createUserActivity, qm0.d<? super a> dVar) {
            super(2, dVar);
            this.f61827b = createUserActivity;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
            return new a(this.f61827b, dVar);
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
            return ((a) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            int i11 = this.f61826a;
            if (i11 != 0) {
                if (i11 == 1) {
                    nm0.l.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                nm0.l.b(obj);
                CreateUserActivity createUserActivity = this.f61827b;
                qf.a aVar = createUserActivity.f61761s;
                if (aVar != null) {
                    this.f61826a = 1;
                    if (((k0) aVar).a(createUserActivity, this, C0783a.f61828a) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    kotlin.jvm.internal.u.s("logoutAndDisconnectDevices");
                    throw null;
                }
            }
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(CreateUserActivity createUserActivity, qm0.d<? super c> dVar) {
        super(2, dVar);
        this.f61825c = createUserActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        return new c(this.f61825c, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
        return ((c) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        ProgressDialog progressDialog;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.f61824b;
        CreateUserActivity createUserActivity = this.f61825c;
        if (i11 != 0) {
            if (i11 == 1) {
                progressDialog = this.f61823a;
                nm0.l.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            nm0.l.b(obj);
            ProgressDialog show = ProgressDialog.show(createUserActivity, null, createUserActivity.getString(C1987R.string._DISCONNECT_), true, false);
            show.show();
            CoroutineDispatcher io2 = Dispatchers.getIO();
            a aVar = new a(createUserActivity, null);
            this.f61823a = show;
            this.f61824b = 1;
            if (BuildersKt.withContext(io2, aVar, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
            progressDialog = show;
        }
        h0 m11 = h0.m(createUserActivity.getApplicationContext());
        m11.c(new Intent(createUserActivity.getApplicationContext(), AuthenticationActivity.class).addFlags(67108864));
        m11.r();
        progressDialog.dismiss();
        return nm0.y.f85009a;
    }
}
