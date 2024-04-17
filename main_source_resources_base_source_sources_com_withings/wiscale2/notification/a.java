package com.withings.wiscale2.notification;

import android.content.Context;
import android.content.Intent;
import com.withings.leaderboard.utils.LeaderboardMessageType;
import com.withings.library.authentication.api.ConstantsWs;
import kotlinx.coroutines.CoroutineScope;
import nm0.y;
import ym0.p;
/* compiled from: LeaderboardNotificationManager.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.notification.LeaderboardNotificationActionReceiver$sendMessageToApi$1$1", f = "LeaderboardNotificationManager.kt", l = {ConstantsWs.WS_STATUS_UNKNOWN_MEASGRP, ConstantsWs.WS_STATUS_WRONGDEVICEINCREMENT}, m = "invokeSuspend")
/* loaded from: classes5.dex */
final class a extends kotlin.coroutines.jvm.internal.i implements p<CoroutineScope, qm0.d<? super y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f58735a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ LeaderboardNotificationActionReceiver f58736b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ LeaderboardMessageType f58737c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ Context f58738d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ Intent f58739e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ long f58740f;

    /* compiled from: LeaderboardNotificationManager.kt */
    /* renamed from: com.withings.wiscale2.notification.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public /* synthetic */ class C0760a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f58741a;

        static {
            int[] iArr = new int[LeaderboardMessageType.values().length];
            try {
                iArr[LeaderboardMessageType.CHEER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LeaderboardMessageType.TAUNT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[LeaderboardMessageType.MESSAGE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f58741a = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(LeaderboardNotificationActionReceiver leaderboardNotificationActionReceiver, LeaderboardMessageType leaderboardMessageType, Context context, Intent intent, long j5, qm0.d<? super a> dVar) {
        super(2, dVar);
        this.f58736b = leaderboardNotificationActionReceiver;
        this.f58737c = leaderboardMessageType;
        this.f58738d = context;
        this.f58739e = intent;
        this.f58740f = j5;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
        return new a(this.f58736b, this.f58737c, this.f58738d, this.f58739e, this.f58740f, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super y> dVar) {
        return ((a) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ab  */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r8 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
            int r0 = r11.f58735a
            com.withings.wiscale2.notification.LeaderboardNotificationActionReceiver r1 = r11.f58736b
            r2 = 0
            r3 = 2
            r4 = 1
            if (r0 == 0) goto L21
            if (r0 == r4) goto L1c
            if (r0 != r3) goto L14
            nm0.l.b(r12)
            goto Lb1
        L14:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L1c:
            nm0.l.b(r12)
            r0 = r12
            goto L35
        L21:
            nm0.l.b(r12)
            r70.c r0 = r1.f58728d
            if (r0 == 0) goto Lb4
            r11.f58735a = r4
            kotlinx.coroutines.flow.Flow r0 = r0.f()
            java.lang.Object r0 = kotlinx.coroutines.flow.FlowKt.firstOrNull(r0, r11)
            if (r0 != r8) goto L35
            return r8
        L35:
            com.withings.user.core.models.User r0 = (com.withings.user.core.models.User) r0
            if (r0 == 0) goto Lb1
            int[] r5 = com.withings.wiscale2.notification.a.C0760a.f58741a
            com.withings.leaderboard.utils.LeaderboardMessageType r6 = r11.f58737c
            int r7 = r6.ordinal()
            r5 = r5[r7]
            android.content.Context r7 = r11.f58738d
            if (r5 == r4) goto L7a
            if (r5 == r3) goto L66
            r4 = 3
            java.lang.String r7 = ""
            if (r5 == r4) goto L50
            r5 = r7
            goto L8e
        L50:
            android.content.Intent r4 = r11.f58739e
            android.os.Bundle r4 = androidx.core.app.d0.i(r4)
            if (r4 == 0) goto L5f
            java.lang.String r5 = "leaderboard_quick_reply"
            java.lang.CharSequence r4 = r4.getCharSequence(r5, r7)
            goto L60
        L5f:
            r4 = r2
        L60:
            java.lang.String r4 = java.lang.String.valueOf(r4)
        L64:
            r5 = r4
            goto L8e
        L66:
            com.withings.user.core.models.User$Names r4 = r0.getNames()
            java.lang.String r4 = r4.getFirst()
            java.lang.Object[] r4 = new java.lang.Object[]{r4}
            r5 = 2132018496(0x7f140540, float:1.96753E38)
            java.lang.String r4 = r7.getString(r5, r4)
            goto L64
        L7a:
            com.withings.user.core.models.User$Names r4 = r0.getNames()
            java.lang.String r4 = r4.getFirst()
            java.lang.Object[] r4 = new java.lang.Object[]{r4}
            r5 = 2132018486(0x7f140536, float:1.967528E38)
            java.lang.String r4 = r7.getString(r5, r4)
            goto L64
        L8e:
            kotlin.jvm.internal.u.g(r5)
            com.withings.leaderboard.repositories.webservice.LeaderboardRemoteRepository r1 = r1.f58727c
            if (r1 == 0) goto Lab
            long r9 = r0.getId()
            java.lang.String r6 = r6.getOptions()
            r11.f58735a = r3
            long r3 = r11.f58740f
            r0 = r1
            r1 = r9
            r7 = r11
            java.lang.Object r0 = r0.pushMessage(r1, r3, r5, r6, r7)
            if (r0 != r8) goto Lb1
            return r8
        Lab:
            java.lang.String r0 = "leaderboardRemoteRepository"
            kotlin.jvm.internal.u.s(r0)
            throw r2
        Lb1:
            nm0.y r0 = nm0.y.f85009a
            return r0
        Lb4:
            java.lang.String r0 = "userRepository"
            kotlin.jvm.internal.u.s(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.wiscale2.notification.a.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
