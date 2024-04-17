package com.withings.leaderboard.ui;

import androidx.compose.material.ModalBottomSheetValue;
import androidx.compose.material.c5;
import androidx.compose.material.f4;
import androidx.compose.runtime.a;
import androidx.compose.runtime.l0;
import androidx.compose.runtime.v0;
import com.withings.leaderboard.repositories.data.SharePublicKey;
import com.withings.library.authentication.api.ConstantsWs;
import k1.r0;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.i;
import kotlin.jvm.internal.w;
import kotlinx.coroutines.CoroutineScope;
import nm0.y;
import qm0.d;
import s1.b;
import wk.h;
import yk.o;
import ym0.p;
/* compiled from: LeaderboardActivity.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lnm0/y;", "invoke", "(Landroidx/compose/runtime/a;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class LeaderboardActivity$onCreate$1 extends w implements p<a, Integer, y> {
    final /* synthetic */ LeaderboardActivity this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LeaderboardActivity.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lnm0/y;", "invoke", "(Landroidx/compose/runtime/a;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.withings.leaderboard.ui.LeaderboardActivity$onCreate$1$1  reason: invalid class name */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass1 extends w implements p<a, Integer, y> {
        final /* synthetic */ LeaderboardActivity this$0;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: LeaderboardActivity.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lnm0/y;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 9, 0})
        @e(c = "com.withings.leaderboard.ui.LeaderboardActivity$onCreate$1$1$1", f = "LeaderboardActivity.kt", l = {123}, m = "invokeSuspend")
        /* renamed from: com.withings.leaderboard.ui.LeaderboardActivity$onCreate$1$1$1  reason: invalid class name and collision with other inner class name */
        /* loaded from: classes3.dex */
        public static final class C05461 extends i implements p<CoroutineScope, d<? super y>, Object> {
            final /* synthetic */ r0<SharePublicKey> $sharedPublicKey$delegate;
            Object L$0;
            int label;
            final /* synthetic */ LeaderboardActivity this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C05461(LeaderboardActivity leaderboardActivity, r0<SharePublicKey> r0Var, d<? super C05461> dVar) {
                super(2, dVar);
                this.this$0 = leaderboardActivity;
                this.$sharedPublicKey$delegate = r0Var;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final d<y> create(Object obj, d<?> dVar) {
                return new C05461(this.this$0, this.$sharedPublicKey$delegate, dVar);
            }

            /* JADX WARN: Removed duplicated region for block: B:25:0x0049  */
            @Override // kotlin.coroutines.jvm.internal.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r8) {
                /*
                    r7 = this;
                    kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
                    int r1 = r7.label
                    r2 = 0
                    r3 = 1
                    if (r1 == 0) goto L1c
                    if (r1 != r3) goto L14
                    java.lang.Object r0 = r7.L$0
                    k1.r0 r0 = (k1.r0) r0
                    nm0.l.b(r8)     // Catch: java.lang.Throwable -> L12
                    goto L39
                L12:
                    r8 = move-exception
                    goto L40
                L14:
                    java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r8.<init>(r0)
                    throw r8
                L1c:
                    nm0.l.b(r8)
                    k1.r0<com.withings.leaderboard.repositories.data.SharePublicKey> r8 = r7.$sharedPublicKey$delegate
                    com.withings.leaderboard.ui.LeaderboardActivity r1 = r7.this$0
                    kotlinx.coroutines.CoroutineDispatcher r4 = kotlinx.coroutines.Dispatchers.getIO()     // Catch: java.lang.Throwable -> L3c
                    com.withings.leaderboard.ui.LeaderboardActivity$onCreate$1$1$1$1$1 r5 = new com.withings.leaderboard.ui.LeaderboardActivity$onCreate$1$1$1$1$1     // Catch: java.lang.Throwable -> L3c
                    r5.<init>(r1, r2)     // Catch: java.lang.Throwable -> L3c
                    r7.L$0 = r8     // Catch: java.lang.Throwable -> L3c
                    r7.label = r3     // Catch: java.lang.Throwable -> L3c
                    java.lang.Object r1 = kotlinx.coroutines.BuildersKt.withContext(r4, r5, r7)     // Catch: java.lang.Throwable -> L3c
                    if (r1 != r0) goto L37
                    return r0
                L37:
                    r0 = r8
                    r8 = r1
                L39:
                    com.withings.leaderboard.repositories.data.SharePublicKey r8 = (com.withings.leaderboard.repositories.data.SharePublicKey) r8     // Catch: java.lang.Throwable -> L12
                    goto L44
                L3c:
                    r0 = move-exception
                    r6 = r0
                    r0 = r8
                    r8 = r6
                L40:
                    nm0.k$a r8 = nm0.l.a(r8)
                L44:
                    boolean r1 = r8 instanceof nm0.k.a
                    if (r1 == 0) goto L49
                    goto L4a
                L49:
                    r2 = r8
                L4a:
                    com.withings.leaderboard.repositories.data.SharePublicKey r2 = (com.withings.leaderboard.repositories.data.SharePublicKey) r2
                    com.withings.leaderboard.ui.LeaderboardActivity$onCreate$1.AnonymousClass1.access$invoke$lambda$2(r0, r2)
                    nm0.y r8 = nm0.y.f85009a
                    return r8
                */
                throw new UnsupportedOperationException("Method not decompiled: com.withings.leaderboard.ui.LeaderboardActivity$onCreate$1.AnonymousClass1.C05461.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            @Override // ym0.p
            public final Object invoke(CoroutineScope coroutineScope, d<? super y> dVar) {
                return ((C05461) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: LeaderboardActivity.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lnm0/y;", "invoke", "(Landroidx/compose/runtime/a;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.withings.leaderboard.ui.LeaderboardActivity$onCreate$1$1$2  reason: invalid class name */
        /* loaded from: classes3.dex */
        public static final class AnonymousClass2 extends w implements p<a, Integer, y> {
            final /* synthetic */ c5 $modalBottomSheetState;
            final /* synthetic */ r0<SharePublicKey> $sharedPublicKey$delegate;
            final /* synthetic */ LeaderboardActivity this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(LeaderboardActivity leaderboardActivity, c5 c5Var, r0<SharePublicKey> r0Var) {
                super(2);
                this.this$0 = leaderboardActivity;
                this.$modalBottomSheetState = c5Var;
                this.$sharedPublicKey$delegate = r0Var;
            }

            @Override // ym0.p
            public /* bridge */ /* synthetic */ y invoke(a aVar, Integer num) {
                invoke(aVar, num.intValue());
                return y.f85009a;
            }

            public final void invoke(a aVar, int i11) {
                if ((i11 & 11) == 2 && aVar.h()) {
                    aVar.C();
                } else {
                    this.this$0.BottomSheetContent(this.$modalBottomSheetState, AnonymousClass1.invoke$lambda$1(this.$sharedPublicKey$delegate), aVar, ConstantsWs.WS_STATUS_ALREADY_EXIST);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: LeaderboardActivity.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lnm0/y;", "invoke", "(Landroidx/compose/runtime/a;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.withings.leaderboard.ui.LeaderboardActivity$onCreate$1$1$3  reason: invalid class name */
        /* loaded from: classes3.dex */
        public static final class AnonymousClass3 extends w implements p<a, Integer, y> {
            final /* synthetic */ c5 $modalBottomSheetState;
            final /* synthetic */ r0<SharePublicKey> $sharedPublicKey$delegate;
            final /* synthetic */ LeaderboardActivity this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass3(LeaderboardActivity leaderboardActivity, c5 c5Var, r0<SharePublicKey> r0Var) {
                super(2);
                this.this$0 = leaderboardActivity;
                this.$modalBottomSheetState = c5Var;
                this.$sharedPublicKey$delegate = r0Var;
            }

            @Override // ym0.p
            public /* bridge */ /* synthetic */ y invoke(a aVar, Integer num) {
                invoke(aVar, num.intValue());
                return y.f85009a;
            }

            public final void invoke(a aVar, int i11) {
                if ((i11 & 11) == 2 && aVar.h()) {
                    aVar.C();
                } else {
                    this.this$0.ScreenContent(this.$modalBottomSheetState, AnonymousClass1.invoke$lambda$1(this.$sharedPublicKey$delegate), null, aVar, 4104, 4);
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(LeaderboardActivity leaderboardActivity) {
            super(2);
            this.this$0 = leaderboardActivity;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final SharePublicKey invoke$lambda$1(r0<SharePublicKey> r0Var) {
            return r0Var.getValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invoke$lambda$2(r0<SharePublicKey> r0Var, SharePublicKey sharePublicKey) {
            r0Var.setValue(sharePublicKey);
        }

        @Override // ym0.p
        public /* bridge */ /* synthetic */ y invoke(a aVar, Integer num) {
            invoke(aVar, num.intValue());
            return y.f85009a;
        }

        public final void invoke(a aVar, int i11) {
            if ((i11 & 11) == 2 && aVar.h()) {
                aVar.C();
                return;
            }
            c5 f11 = f4.f(ModalBottomSheetValue.f4842a, null, false, aVar, 14);
            aVar.s(-205926253);
            Object t11 = aVar.t();
            if (t11 == a.C0060a.a()) {
                t11 = l0.f(null, v0.f8878a);
                aVar.n(t11);
            }
            r0 r0Var = (r0) t11;
            aVar.J();
            k1.y.f(Boolean.TRUE, new C05461(this.this$0, r0Var, null), aVar);
            h.a(null, f11, null, b.b(aVar, -218406981, new AnonymousClass2(this.this$0, f11, r0Var)), b.b(aVar, -1106444518, new AnonymousClass3(this.this$0, f11, r0Var)), aVar, 27712, 5);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LeaderboardActivity$onCreate$1(LeaderboardActivity leaderboardActivity) {
        super(2);
        this.this$0 = leaderboardActivity;
    }

    @Override // ym0.p
    public /* bridge */ /* synthetic */ y invoke(a aVar, Integer num) {
        invoke(aVar, num.intValue());
        return y.f85009a;
    }

    public final void invoke(a aVar, int i11) {
        if ((i11 & 11) == 2 && aVar.h()) {
            aVar.C();
        } else {
            o.b(false, b.b(aVar, 1499709461, new AnonymousClass1(this.this$0)), aVar, 48, 1);
        }
    }
}
