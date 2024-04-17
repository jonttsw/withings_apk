package com.withings.wiscale2.user.ui.profile;

import aa0.a;
import com.withings.library.authentication.api.ConstantsWs;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.MutableStateFlow;
/* compiled from: EditProfileActivity.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.user.ui.profile.EditProfileActivity$initViewModel$1$4", f = "EditProfileActivity.kt", l = {ConstantsWs.MEASURE_TYPE_WAIST}, m = "invokeSuspend")
/* loaded from: classes5.dex */
final class a0 extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f61933a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ s0 f61934b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ EditProfileActivity f61935c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: EditProfileActivity.kt */
    /* loaded from: classes5.dex */
    public static final class a<T> implements FlowCollector {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ EditProfileActivity f61936a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: EditProfileActivity.kt */
        @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.user.ui.profile.EditProfileActivity$initViewModel$1$4$1", f = "EditProfileActivity.kt", l = {204}, m = "emit")
        /* renamed from: com.withings.wiscale2.user.ui.profile.a0$a$a  reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        public static final class C0785a extends kotlin.coroutines.jvm.internal.c {

            /* renamed from: a  reason: collision with root package name */
            Object f61937a;

            /* renamed from: b  reason: collision with root package name */
            /* synthetic */ Object f61938b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ a<T> f61939c;

            /* renamed from: d  reason: collision with root package name */
            int f61940d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C0785a(a<? super T> aVar, qm0.d<? super C0785a> dVar) {
                super(dVar);
                this.f61939c = aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f61938b = obj;
                this.f61940d |= Integer.MIN_VALUE;
                return this.f61939c.emit(null, this);
            }
        }

        a(EditProfileActivity editProfileActivity) {
            this.f61936a = editProfileActivity;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(aa0.a.AbstractC0006a r5, qm0.d<? super nm0.y> r6) {
            /*
                r4 = this;
                boolean r0 = r6 instanceof com.withings.wiscale2.user.ui.profile.a0.a.C0785a
                if (r0 == 0) goto L13
                r0 = r6
                com.withings.wiscale2.user.ui.profile.a0$a$a r0 = (com.withings.wiscale2.user.ui.profile.a0.a.C0785a) r0
                int r1 = r0.f61940d
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f61940d = r1
                goto L18
            L13:
                com.withings.wiscale2.user.ui.profile.a0$a$a r0 = new com.withings.wiscale2.user.ui.profile.a0$a$a
                r0.<init>(r4, r6)
            L18:
                java.lang.Object r6 = r0.f61938b
                kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
                int r2 = r0.f61940d
                r3 = 1
                if (r2 == 0) goto L34
                if (r2 != r3) goto L2c
                java.lang.Object r5 = r0.f61937a
                com.withings.wiscale2.user.ui.profile.a0$a r5 = (com.withings.wiscale2.user.ui.profile.a0.a) r5
                nm0.l.b(r6)
                goto L9e
            L2c:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L34:
                nm0.l.b(r6)
                boolean r6 = r5 instanceof aa0.a.AbstractC0006a.C0007a
                com.withings.wiscale2.user.ui.profile.EditProfileActivity r2 = r4.f61936a
                if (r6 == 0) goto L4b
                com.withings.wiscale2.user.ui.profile.s0 r5 = com.withings.wiscale2.user.ui.profile.EditProfileActivity.J3(r2)
                androidx.compose.runtime.ParcelableSnapshotMutableState r5 = r5.V0()
                java.lang.Boolean r6 = java.lang.Boolean.FALSE
                r5.setValue(r6)
                goto Lad
            L4b:
                boolean r6 = r5 instanceof aa0.a.AbstractC0006a.c
                if (r6 == 0) goto L5d
                com.withings.wiscale2.user.ui.profile.s0 r5 = com.withings.wiscale2.user.ui.profile.EditProfileActivity.J3(r2)
                androidx.compose.runtime.ParcelableSnapshotMutableState r5 = r5.V0()
                java.lang.Boolean r6 = java.lang.Boolean.TRUE
                r5.setValue(r6)
                goto Lad
            L5d:
                boolean r6 = r5 instanceof aa0.a.AbstractC0006a.b
                if (r6 == 0) goto L80
                com.withings.wiscale2.user.ui.profile.s0 r6 = com.withings.wiscale2.user.ui.profile.EditProfileActivity.J3(r2)
                androidx.compose.runtime.ParcelableSnapshotMutableState r6 = r6.V0()
                java.lang.Boolean r0 = java.lang.Boolean.FALSE
                r6.setValue(r0)
                aa0.a$a$b r5 = (aa0.a.AbstractC0006a.b) r5
                java.lang.String r5 = r5.a()
                if (r5 != 0) goto L78
                java.lang.String r5 = "Error"
            L78:
                android.widget.Toast r5 = android.widget.Toast.makeText(r2, r5, r3)
                r5.show()
                goto Lad
            L80:
                boolean r5 = r5 instanceof aa0.a.AbstractC0006a.d
                if (r5 == 0) goto Lad
                com.withings.wiscale2.user.ui.profile.s0 r5 = com.withings.wiscale2.user.ui.profile.EditProfileActivity.J3(r2)
                kotlinx.coroutines.flow.MutableSharedFlow r5 = r5.U0()
                java.lang.Integer r6 = new java.lang.Integer
                r2 = -1
                r6.<init>(r2)
                r0.f61937a = r4
                r0.f61940d = r3
                java.lang.Object r5 = r5.emit(r6, r0)
                if (r5 != r1) goto L9d
                return r1
            L9d:
                r5 = r4
            L9e:
                com.withings.wiscale2.user.ui.profile.EditProfileActivity r5 = r5.f61936a
                com.withings.wiscale2.user.ui.profile.s0 r5 = com.withings.wiscale2.user.ui.profile.EditProfileActivity.J3(r5)
                androidx.compose.runtime.ParcelableSnapshotMutableState r5 = r5.V0()
                java.lang.Boolean r6 = java.lang.Boolean.FALSE
                r5.setValue(r6)
            Lad:
                nm0.y r5 = nm0.y.f85009a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.withings.wiscale2.user.ui.profile.a0.a.emit(aa0.a$a, qm0.d):java.lang.Object");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(s0 s0Var, EditProfileActivity editProfileActivity, qm0.d<? super a0> dVar) {
        super(2, dVar);
        this.f61934b = s0Var;
        this.f61935c = editProfileActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        return new a0(this.f61934b, this.f61935c, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
        ((a0) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
        return CoroutineSingletons.f76214a;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.f61933a;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            nm0.l.b(obj);
        } else {
            nm0.l.b(obj);
            MutableStateFlow<a.AbstractC0006a> T0 = this.f61934b.T0();
            a aVar = new a(this.f61935c);
            this.f61933a = 1;
            if (T0.collect(aVar, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        throw new KotlinNothingValueException();
    }
}
