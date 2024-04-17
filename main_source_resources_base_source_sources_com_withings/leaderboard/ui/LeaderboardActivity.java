package com.withings.leaderboard.ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.media.session.c;
import androidx.camera.core.v;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.e1;
import androidx.compose.foundation.layout.x0;
import androidx.compose.material.c5;
import androidx.compose.material.h6;
import androidx.compose.material3.a9;
import androidx.compose.material3.i1;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.ui.e;
import androidx.compose.ui.layout.l0;
import androidx.compose.ui.node.g;
import androidx.compose.ui.platform.u0;
import androidx.core.view.l1;
import androidx.datastore.preferences.protobuf.e;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.d0;
import androidx.lifecycle.g1;
import androidx.lifecycle.n1;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.samsung.android.sdk.healthdata.HealthUserProfile;
import com.withings.common.compose.component.o;
import com.withings.healthplus.navigation.ui.navigation.NavigationArguments;
import com.withings.leaderboard.domain.LeaderboardSyncJobFactory;
import com.withings.leaderboard.repositories.data.LeaderboardEntry;
import com.withings.leaderboard.repositories.data.LeaderboardEntryKt;
import com.withings.leaderboard.repositories.data.SharePublicKey;
import com.withings.leaderboard.repositories.webservice.LeaderboardRemoteRepository;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.periodsbar.Period;
import com.withings.wiscale2.C1987R;
import com.withings.wiscale2.device.hwa08.postinstall.b0;
import en0.r;
import fn0.k;
import i6.a;
import java.io.Serializable;
import javax.inject.Inject;
import k1.j1;
import k1.o1;
import k1.r0;
import k1.v0;
import k1.y;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.q0;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.Flow;
import m0.t;
import nm0.g;
import nm0.h;
import org.apache.http.protocol.HTTP;
import org.joda.time.DateTime;
import t00.d;
import u0.i0;
import u0.n0;
import wk.p;
import ym0.a;
import ym0.l;
/* compiled from: LeaderboardActivity.kt */
@Metadata(d1 = {"\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u0000 X2\u00020\u0001:\u0001XB\u0007¢\u0006\u0004\bV\u0010WJ+\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0003¢\u0006\u0004\b\t\u0010\nJA\u0010\u0014\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\b0\u000f2\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\b0\u0011H\u0003¢\u0006\u0004\b\u0014\u0010\u0015J'\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u00062\u000e\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u0017H\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ!\u0010\u001b\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001f\u001a\u00020\b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010%\u001a\u00020$2\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020!H\u0002¢\u0006\u0004\b%\u0010&J\u0019\u0010)\u001a\u00020\b2\b\u0010(\u001a\u0004\u0018\u00010'H\u0014¢\u0006\u0004\b)\u0010*J)\u0010/\u001a\u00020\b2\u0006\u0010+\u001a\u00020$2\u0006\u0010,\u001a\u00020$2\b\u0010.\u001a\u0004\u0018\u00010-H\u0014¢\u0006\u0004\b/\u00100R\u001b\u00106\u001a\u0002018BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R\u001b\u0010#\u001a\u00020!8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b7\u00103\u001a\u0004\b8\u00109R\"\u0010;\u001a\u00020:8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R\"\u0010B\u001a\u00020A8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bB\u0010C\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR\"\u0010I\u001a\u00020H8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bI\u0010J\u001a\u0004\bK\u0010L\"\u0004\bM\u0010NR\"\u0010P\u001a\u00020O8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bP\u0010Q\u001a\u0004\bR\u0010S\"\u0004\bT\u0010U¨\u0006Z²\u0006\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u00048\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010Y\u001a\u0004\u0018\u00010!8\nX\u008a\u0084\u0002"}, d2 = {"Lcom/withings/leaderboard/ui/LeaderboardActivity;", "Lcom/withings/android/activity/WithingsActivity;", "Landroidx/compose/material/c5;", "modalBottomSheetState", "Lcom/withings/leaderboard/repositories/data/SharePublicKey;", "sharedPublicKey", "Lcom/withings/leaderboard/ui/LeaderboardViewModel;", "leaderboardViewModel", "Lnm0/y;", "ScreenContent", "(Landroidx/compose/material/c5;Lcom/withings/leaderboard/repositories/data/SharePublicKey;Lcom/withings/leaderboard/ui/LeaderboardViewModel;Landroidx/compose/runtime/a;II)V", "Landroidx/compose/ui/e;", "modifier", "Lu0/i0;", "pagerState", "Lkotlin/Function0;", "onInviteClicked", "Lkotlin/Function1;", "Lcom/withings/leaderboard/repositories/data/LeaderboardEntry;", "onLongClick", "LeaderboardPager", "(Landroidx/compose/ui/e;Lu0/i0;Lym0/a;Lym0/l;Landroidx/compose/runtime/a;I)V", "viewModel", "Lk1/r0;", "userToDelete", "AskDelete", "(Lcom/withings/leaderboard/ui/LeaderboardViewModel;Lk1/r0;Landroidx/compose/runtime/a;I)V", "BottomSheetContent", "(Landroidx/compose/material/c5;Lcom/withings/leaderboard/repositories/data/SharePublicKey;Landroidx/compose/runtime/a;I)V", "", "messageToShare", "inviteToLeaderboard", "(Ljava/lang/String;)V", "Lorg/joda/time/DateTime;", "historyFirstDate", "notificationDate", "", "getWeekPageCorrespondingToNotificationDate", "(Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;)I", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "requestCode", "resultCode", "Landroid/content/Intent;", "data", "onActivityResult", "(IILandroid/content/Intent;)V", "", "userId$delegate", "Lbn0/d;", "getUserId", "()J", NavigationArguments.USER_ID, "notificationDate$delegate", "getNotificationDate", "()Lorg/joda/time/DateTime;", "Lcom/withings/leaderboard/domain/LeaderboardSyncJobFactory;", "leaderboardSyncJobFactory", "Lcom/withings/leaderboard/domain/LeaderboardSyncJobFactory;", "getLeaderboardSyncJobFactory", "()Lcom/withings/leaderboard/domain/LeaderboardSyncJobFactory;", "setLeaderboardSyncJobFactory", "(Lcom/withings/leaderboard/domain/LeaderboardSyncJobFactory;)V", "Lt00/d;", "networkSyncManager", "Lt00/d;", "getNetworkSyncManager", "()Lt00/d;", "setNetworkSyncManager", "(Lt00/d;)V", "Lcom/withings/leaderboard/ui/LeaderboardWeekViewModelFactory;", "viewModelFactory", "Lcom/withings/leaderboard/ui/LeaderboardWeekViewModelFactory;", "getViewModelFactory", "()Lcom/withings/leaderboard/ui/LeaderboardWeekViewModelFactory;", "setViewModelFactory", "(Lcom/withings/leaderboard/ui/LeaderboardWeekViewModelFactory;)V", "Lcom/withings/leaderboard/repositories/webservice/LeaderboardRemoteRepository;", "leaderboardRemoteRepository", "Lcom/withings/leaderboard/repositories/webservice/LeaderboardRemoteRepository;", "getLeaderboardRemoteRepository", "()Lcom/withings/leaderboard/repositories/webservice/LeaderboardRemoteRepository;", "setLeaderboardRemoteRepository", "(Lcom/withings/leaderboard/repositories/webservice/LeaderboardRemoteRepository;)V", "<init>", "()V", "Companion", "firstLeaderboardDate", "leaderboard_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class LeaderboardActivity extends Hilt_LeaderboardActivity {
    private static final int MY_QR_CODE_REQUEST_CODE = 4321;
    private static final int SCAN_FRIEND_CODE_REQUEST_CODE = 1234;
    @Inject
    public LeaderboardRemoteRepository leaderboardRemoteRepository;
    @Inject
    public LeaderboardSyncJobFactory leaderboardSyncJobFactory;
    @Inject
    public d networkSyncManager;
    @Inject
    public LeaderboardWeekViewModelFactory viewModelFactory;
    static final /* synthetic */ k<Object>[] $$delegatedProperties = {v.c(LeaderboardActivity.class, NavigationArguments.USER_ID, "getUserId()J", 0), v.c(LeaderboardActivity.class, "notificationDate", "getNotificationDate()Lorg/joda/time/DateTime;", 0)};
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final Period period = Period.f43722g;
    private final bn0.d userId$delegate = new bn0.d<Activity, Long>() { // from class: com.withings.leaderboard.ui.LeaderboardActivity$special$$inlined$extra$1
        private final g value$delegate = h.b(new AnonymousClass1());

        /* compiled from: Activity.kt */
        @Metadata(d1 = {"\u0000\u0004\n\u0002\b\u0004\u0010\u0003\u001a\u00028\u0000\"\u0006\b\u0000\u0010\u0000\u0018\u0001H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"T", "invoke", "()Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.withings.leaderboard.ui.LeaderboardActivity$special$$inlined$extra$1$1  reason: invalid class name */
        /* loaded from: classes3.dex */
        public static final class AnonymousClass1 extends w implements a<Long> {
            public AnonymousClass1() {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Long, java.lang.Object] */
            @Override // ym0.a
            public final Long invoke() {
                return getExtra();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Long getExtra() {
            return Long.valueOf(b0.E(this, r2));
        }

        /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Long, java.lang.Object] */
        /* renamed from: getValue  reason: avoid collision after fix types in other method */
        public Long getValue2(Activity thisRef, k<?> property) {
            u.j(thisRef, "thisRef");
            u.j(property, "property");
            return getValue();
        }

        /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Long, java.lang.Object] */
        @Override // bn0.d
        public /* bridge */ /* synthetic */ Long getValue(Activity activity, k kVar) {
            return getValue2(activity, (k<?>) kVar);
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Long, java.lang.Object] */
        public final Long getValue() {
            return this.value$delegate.getValue();
        }
    };
    private final bn0.d notificationDate$delegate = new bn0.d<Activity, DateTime>() { // from class: com.withings.leaderboard.ui.LeaderboardActivity$special$$inlined$extra$2
        private final g value$delegate = h.b(new AnonymousClass1());

        /* compiled from: Activity.kt */
        @Metadata(d1 = {"\u0000\u0004\n\u0002\b\u0004\u0010\u0003\u001a\u00028\u0000\"\u0006\b\u0000\u0010\u0000\u0018\u0001H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"T", "invoke", "()Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.withings.leaderboard.ui.LeaderboardActivity$special$$inlined$extra$2$1  reason: invalid class name */
        /* loaded from: classes3.dex */
        public static final class AnonymousClass1 extends w implements a<DateTime> {
            public AnonymousClass1() {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [org.joda.time.DateTime, java.lang.Object] */
            @Override // ym0.a
            public final DateTime invoke() {
                return getExtra();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final DateTime getExtra() {
            if (Parcelable.class.isAssignableFrom(DateTime.class)) {
                return (DateTime) b0.F(this, r2);
            }
            if (Serializable.class.isAssignableFrom(DateTime.class)) {
                return (DateTime) b0.H(this, r2);
            }
            String str = r2;
            fn0.d b10 = q0.b(DateTime.class);
            throw new IllegalArgumentException("extra " + str + " of class " + b10 + " is not supported");
        }

        /* JADX WARN: Type inference failed for: r2v2, types: [org.joda.time.DateTime, java.lang.Object] */
        /* renamed from: getValue  reason: avoid collision after fix types in other method */
        public DateTime getValue2(Activity thisRef, k<?> property) {
            u.j(thisRef, "thisRef");
            u.j(property, "property");
            return getValue();
        }

        /* JADX WARN: Type inference failed for: r1v2, types: [org.joda.time.DateTime, java.lang.Object] */
        @Override // bn0.d
        public /* bridge */ /* synthetic */ DateTime getValue(Activity activity, k kVar) {
            return getValue2(activity, (k<?>) kVar);
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [org.joda.time.DateTime, java.lang.Object] */
        public final DateTime getValue() {
            return this.value$delegate.getValue();
        }
    };

    /* compiled from: LeaderboardActivity.kt */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\"\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000fH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/withings/leaderboard/ui/LeaderboardActivity$Companion;", "", "()V", "MY_QR_CODE_REQUEST_CODE", "", "SCAN_FRIEND_CODE_REQUEST_CODE", "period", "Lcom/withings/periodsbar/Period;", "createIntent", "Landroid/content/Intent;", ConstantsWs.JSON_ACCOUNT_KEY_CONTEXT, "Landroid/content/Context;", NavigationArguments.USER_ID, "", "entryDate", "Lorg/joda/time/DateTime;", "leaderboard_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(m mVar) {
            this();
        }

        public static /* synthetic */ Intent createIntent$default(Companion companion, Context context, long j5, DateTime dateTime, int i11, Object obj) {
            if ((i11 & 4) != 0) {
                dateTime = DateTime.now();
                u.i(dateTime, "now(...)");
            }
            return companion.createIntent(context, j5, dateTime);
        }

        public final Intent createIntent(Context context, long j5, DateTime entryDate) {
            u.j(context, "context");
            u.j(entryDate, "entryDate");
            Intent putExtra = new Intent(context, LeaderboardActivity.class).putExtra(HealthUserProfile.USER_PROFILE_KEY_USER_ID, j5).putExtra("date", entryDate);
            u.i(putExtra, "putExtra(...)");
            return putExtra;
        }

        private Companion() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void AskDelete(LeaderboardViewModel leaderboardViewModel, r0<LeaderboardEntry> r0Var, androidx.compose.runtime.a aVar, int i11) {
        boolean z5;
        String str;
        b g11 = aVar.g(1612967043);
        g11.s(686052611);
        int i12 = (i11 & 112) ^ 48;
        boolean z11 = true;
        if ((i12 > 32 && g11.K(r0Var)) || (i11 & 48) == 32) {
            z5 = true;
        } else {
            z5 = false;
        }
        Object t11 = g11.t();
        if (z5 || t11 == a.C0060a.a()) {
            t11 = new LeaderboardActivity$AskDelete$1$1(r0Var);
            g11.n(t11);
        }
        ym0.a aVar2 = (ym0.a) t11;
        g11.J();
        String u11 = ay.b.u(C1987R.string._LEADERBOARD_, g11);
        Object[] objArr = new Object[1];
        LeaderboardEntry value = r0Var.getValue();
        if (value != null) {
            str = LeaderboardEntryKt.getUsername(value);
        } else {
            str = null;
        }
        if (str == null) {
            str = "";
        }
        objArr[0] = str;
        String v11 = ay.b.v(C1987R.string._LEADERBOARD_DELETE_FRIEND_CONFIRMATION_, objArr, g11);
        String u12 = ay.b.u(C1987R.string._YES_, g11);
        LeaderboardActivity$AskDelete$2 leaderboardActivity$AskDelete$2 = new LeaderboardActivity$AskDelete$2(leaderboardViewModel, r0Var);
        String u13 = ay.b.u(C1987R.string._CANCEL_, g11);
        g11.s(686053169);
        if ((i12 <= 32 || !g11.K(r0Var)) && (i11 & 48) != 32) {
            z11 = false;
        }
        Object t12 = g11.t();
        if (z11 || t12 == a.C0060a.a()) {
            t12 = new LeaderboardActivity$AskDelete$3$1(r0Var);
            g11.n(t12);
        }
        g11.J();
        p.a(aVar2, u11, v11, u12, 0L, leaderboardActivity$AskDelete$2, u13, 0L, (ym0.a) t12, g11, 0, ConstantsWs.MEASURE_TYPE_HR_LEVEL_MAX);
        androidx.compose.runtime.v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new LeaderboardActivity$AskDelete$4(this, leaderboardViewModel, r0Var, i11));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void BottomSheetContent(c5 c5Var, SharePublicKey sharePublicKey, androidx.compose.runtime.a aVar, int i11) {
        b g11 = aVar.g(1026849043);
        g11.s(773894976);
        g11.s(-492369756);
        Object t11 = g11.t();
        if (t11 == a.C0060a.a()) {
            t11 = e.b(y.i(g11), g11);
        }
        g11.J();
        CoroutineScope a11 = ((androidx.compose.runtime.k) t11).a();
        g11.J();
        g11.s(-483455358);
        e.a aVar2 = androidx.compose.ui.e.f8927a;
        l0 b10 = c.b(androidx.compose.foundation.layout.e.h(), g11, -1323940314);
        int G = g11.G();
        v0 l5 = g11.l();
        androidx.compose.ui.node.g.D.getClass();
        ym0.a a12 = g.a.a();
        s1.a c11 = androidx.compose.ui.layout.y.c(aVar2);
        if (g11.i() instanceof k1.d) {
            g11.A();
            if (g11.e()) {
                g11.F(a12);
            } else {
                g11.m();
            }
            ym0.p b11 = com.withings.authentication.e.b(g11, b10, g11, l5);
            if (g11.e() || !u.e(g11.t(), Integer.valueOf(G))) {
                androidx.camera.camera2.internal.l0.d(G, g11, G, b11);
            }
            o.g(x0.h(aVar2, og.y.a(0, c11, j1.a(g11), g11, 2058660585), 0.0f, 2), null, null, ay.b.u(C1987R.string.friendRequest_scanMyFriendCode, g11), null, false, false, false, null, null, new LeaderboardActivity$BottomSheetContent$1$1(a11, this, c5Var), g11, 0, 0, 1014);
            o.g(x0.h(aVar2, yk.h.o(), 0.0f, 2), null, null, ay.b.u(C1987R.string.friendRequest_myFriendshipCode, g11), null, true, false, false, null, null, new LeaderboardActivity$BottomSheetContent$1$2(a11, sharePublicKey, c5Var, this), g11, 196608, 0, 982);
            o.g(x0.h(aVar2, yk.h.o(), 0.0f, 2), null, null, ay.b.u(C1987R.string._INVITE_VIA_, g11), null, true, false, false, null, null, new LeaderboardActivity$BottomSheetContent$1$3(a11, sharePublicKey, c5Var, this), g11, 196608, 0, 982);
            androidx.compose.runtime.v b12 = h6.b(g11);
            if (b12 != null) {
                b12.G(new LeaderboardActivity$BottomSheetContent$2(this, c5Var, sharePublicKey, i11));
                return;
            }
            return;
        }
        a3.g.s();
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void LeaderboardPager(androidx.compose.ui.e eVar, i0 i0Var, ym0.a<nm0.y> aVar, l<? super LeaderboardEntry, nm0.y> lVar, androidx.compose.runtime.a aVar2, int i11) {
        b g11 = aVar2.g(-914912423);
        u0.o.a(i0Var, eVar, null, null, 0, 0.0f, null, null, false, true, null, null, s1.b.b(g11, -1707553060, new LeaderboardActivity$LeaderboardPager$1(this, aVar, lVar, (Context) g11.D(u0.d()))), g11, ((i11 >> 3) & 14) | 805306368 | ((i11 << 3) & 112), ConstantsWs.WS_STATUS_LOGIN_UNAUTHORIZED, 3580);
        androidx.compose.runtime.v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new LeaderboardActivity$LeaderboardPager$2(this, eVar, i0Var, aVar, lVar, i11));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void ScreenContent(c5 c5Var, SharePublicKey sharePublicKey, LeaderboardViewModel leaderboardViewModel, androidx.compose.runtime.a aVar, int i11, int i12) {
        LeaderboardViewModel leaderboardViewModel2;
        b bVar;
        LeaderboardViewModel leaderboardViewModel3;
        i6.a aVar2;
        b g11 = aVar.g(1436239376);
        if ((i12 & 4) != 0) {
            g11.s(1890788296);
            n1 a11 = j6.a.a(g11);
            if (a11 != null) {
                fk0.c a12 = e6.a.a(a11, g11);
                g11.s(1729797275);
                if (a11 instanceof androidx.lifecycle.u) {
                    aVar2 = ((androidx.lifecycle.u) a11).getDefaultViewModelCreationExtras();
                } else {
                    aVar2 = a.C1058a.f71431b;
                }
                g1 a13 = j6.b.a(LeaderboardViewModel.class, a11, null, a12, aVar2, g11);
                g11.J();
                g11.J();
                leaderboardViewModel2 = (LeaderboardViewModel) a13;
            } else {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
        } else {
            leaderboardViewModel2 = leaderboardViewModel;
        }
        Object c11 = androidx.compose.material.o.c(g11, 773894976, -492369756);
        if (c11 == a.C0060a.a()) {
            c11 = androidx.datastore.preferences.protobuf.e.b(y.i(g11), g11);
        }
        g11.J();
        CoroutineScope a14 = ((androidx.compose.runtime.k) c11).a();
        g11.J();
        e.a aVar3 = androidx.compose.ui.e.f8927a;
        androidx.compose.ui.e d11 = e1.d(aVar3);
        g11.s(-483455358);
        l0 b10 = c.b(androidx.compose.foundation.layout.e.h(), g11, -1323940314);
        int G = g11.G();
        v0 l5 = g11.l();
        androidx.compose.ui.node.g.D.getClass();
        ym0.a a15 = g.a.a();
        s1.a c12 = androidx.compose.ui.layout.y.c(d11);
        if (g11.i() instanceof k1.d) {
            g11.A();
            if (g11.e()) {
                g11.F(a15);
            } else {
                g11.m();
            }
            ym0.p b11 = com.withings.authentication.e.b(g11, b10, g11, l5);
            if (g11.e() || !u.e(g11.t(), Integer.valueOf(G))) {
                androidx.camera.camera2.internal.l0.d(G, g11, G, b11);
            }
            c12.invoke(j1.a(g11), g11, 0);
            g11.s(2058660585);
            ym0.a<nm0.y> leaderboardActivity$ScreenContent$1$onInviteClicked$1 = new LeaderboardActivity$ScreenContent$1$onInviteClicked$1(sharePublicKey, this, a14, c5Var);
            Flow<DateTime> flow = leaderboardViewModel2.getFirstLeaderboardDate();
            u.j(flow, "flow");
            g11.s(-486305083);
            Lifecycle lifecycle = ((d0) g11.D(u0.f())).getLifecycle();
            Lifecycle.State state = Lifecycle.State.f14375d;
            g11.s(-1106565343);
            boolean K = g11.K(flow) | g11.K(lifecycle);
            Object t11 = g11.t();
            if (K || t11 == a.C0060a.a()) {
                t11 = androidx.lifecycle.o.a(flow, lifecycle, state);
                g11.n(t11);
            }
            g11.J();
            g11.J();
            DateTime ScreenContent$lambda$7$lambda$0 = ScreenContent$lambda$7$lambda$0(androidx.compose.runtime.l0.a((Flow) t11, null, null, g11, 2));
            g11.s(1567383252);
            if (ScreenContent$lambda$7$lambda$0 == null) {
                bVar = g11;
                leaderboardViewModel3 = leaderboardViewModel2;
            } else {
                g11.s(-1572930095);
                Object t12 = g11.t();
                if (t12 == a.C0060a.a()) {
                    t12 = Integer.valueOf(getWeekPageCorrespondingToNotificationDate(ScreenContent$lambda$7$lambda$0, getNotificationDate()));
                    g11.n(t12);
                }
                int intValue = ((Number) t12).intValue();
                g11.J();
                i0 e11 = n0.e(intValue, new LeaderboardActivity$ScreenContent$1$1$contentPagerState$1(ScreenContent$lambda$7$lambda$0), g11, 2);
                g11.s(-1572929696);
                Object t13 = g11.t();
                if (t13 == a.C0060a.a()) {
                    t13 = androidx.compose.runtime.l0.f(null, androidx.compose.runtime.v0.f8878a);
                    g11.n(t13);
                }
                r0<LeaderboardEntry> r0Var = (r0) t13;
                g11.J();
                g11.s(-1499544316);
                if (r0Var.getValue() != null) {
                    AskDelete(leaderboardViewModel2, r0Var, g11, ConstantsWs.WS_STATUS_INVALID_PASSWORD_TOO_LONG);
                }
                g11.J();
                a9.a(null, null, 0L, 0L, 0.0f, 0.0f, null, s1.b.b(g11, -1320780759, new LeaderboardActivity$ScreenContent$1$1$1(leaderboardActivity$ScreenContent$1$onInviteClicked$1, this)), g11, 12582912, 127);
                LeaderboardActivity$ScreenContent$1$1$onMovePage$1 leaderboardActivity$ScreenContent$1$1$onMovePage$1 = new LeaderboardActivity$ScreenContent$1$1$onMovePage$1(a14, e11);
                long O = ((i1) g11.D(androidx.compose.material3.j1.e())).O();
                Period period2 = period;
                int s11 = e11.s();
                int B = e11.B();
                g11.s(-1572928605);
                boolean K2 = g11.K(leaderboardActivity$ScreenContent$1$1$onMovePage$1);
                Object t14 = g11.t();
                if (K2 || t14 == a.C0060a.a()) {
                    t14 = new LeaderboardActivity$ScreenContent$1$1$2$1(leaderboardActivity$ScreenContent$1$1$onMovePage$1);
                    g11.n(t14);
                }
                l lVar = (l) t14;
                g11.J();
                g11.s(-1572928677);
                boolean K3 = g11.K(leaderboardActivity$ScreenContent$1$1$onMovePage$1);
                Object t15 = g11.t();
                if (K3 || t15 == a.C0060a.a()) {
                    t15 = new LeaderboardActivity$ScreenContent$1$1$3$1(leaderboardActivity$ScreenContent$1$1$onMovePage$1);
                    g11.n(t15);
                }
                g11.J();
                g20.c.b(s11, B, O, lVar, (l) t15, null, period2, null, null, false, null, null, null, g11, 1572864, 0, 8096);
                androidx.compose.ui.e e12 = e1.e(aVar3, 1.0f);
                if (1.0f > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                    androidx.compose.ui.e n11 = e12.n(new LayoutWeightElement(r.f(1.0f, Float.MAX_VALUE), true));
                    g11.s(-1572928259);
                    Object t16 = g11.t();
                    if (t16 == a.C0060a.a()) {
                        t16 = new LeaderboardActivity$ScreenContent$1$1$4$1(r0Var);
                        g11.n(t16);
                    }
                    g11.J();
                    bVar = g11;
                    leaderboardViewModel3 = leaderboardViewModel2;
                    LeaderboardPager(n11, e11, leaderboardActivity$ScreenContent$1$onInviteClicked$1, (l) t16, bVar, 35840);
                    nm0.y yVar = nm0.y.f85009a;
                } else {
                    throw new IllegalArgumentException("invalid weight 1.0; must be greater than zero".toString());
                }
            }
            androidx.compose.runtime.v a16 = com.withings.authentication.mfa.resolve.components.h.a(bVar);
            if (a16 != null) {
                a16.G(new LeaderboardActivity$ScreenContent$2(this, c5Var, sharePublicKey, leaderboardViewModel3, i11, i12));
                return;
            }
            return;
        }
        a3.g.s();
        throw null;
    }

    private static final DateTime ScreenContent$lambda$7$lambda$0(o1<DateTime> o1Var) {
        return o1Var.getValue();
    }

    public static final Intent createIntent(Context context, long j5, DateTime dateTime) {
        return Companion.createIntent(context, j5, dateTime);
    }

    private final DateTime getNotificationDate() {
        return (DateTime) this.notificationDate$delegate.getValue(this, $$delegatedProperties[1]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long getUserId() {
        return ((Number) this.userId$delegate.getValue(this, $$delegatedProperties[0])).longValue();
    }

    private final int getWeekPageCorrespondingToNotificationDate(DateTime dateTime, DateTime dateTime2) {
        DateTime withDayOfWeek = DateTime.now().withDayOfWeek(1);
        u.i(withDayOfWeek, "withDayOfWeek(...)");
        int i11 = 0;
        while (dateTime2.isBefore(withDayOfWeek) && withDayOfWeek.isAfter(dateTime)) {
            i11++;
            withDayOfWeek = withDayOfWeek.minusWeeks(1);
            u.i(withDayOfWeek, "minusWeeks(...)");
        }
        return i11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void inviteToLeaderboard(String str) {
        Intent intent = new Intent();
        intent.setAction("android.intent.action.SEND");
        intent.putExtra("android.intent.extra.TEXT", str);
        intent.setType(HTTP.PLAIN_TEXT_TYPE);
        startActivity(Intent.createChooser(intent, getString(C1987R.string._INVITE_VIA_)));
    }

    public final LeaderboardRemoteRepository getLeaderboardRemoteRepository() {
        LeaderboardRemoteRepository leaderboardRemoteRepository = this.leaderboardRemoteRepository;
        if (leaderboardRemoteRepository != null) {
            return leaderboardRemoteRepository;
        }
        u.s("leaderboardRemoteRepository");
        throw null;
    }

    public final LeaderboardSyncJobFactory getLeaderboardSyncJobFactory() {
        LeaderboardSyncJobFactory leaderboardSyncJobFactory = this.leaderboardSyncJobFactory;
        if (leaderboardSyncJobFactory != null) {
            return leaderboardSyncJobFactory;
        }
        u.s("leaderboardSyncJobFactory");
        throw null;
    }

    public final d getNetworkSyncManager() {
        d dVar = this.networkSyncManager;
        if (dVar != null) {
            return dVar;
        }
        u.s("networkSyncManager");
        throw null;
    }

    public final LeaderboardWeekViewModelFactory getViewModelFactory() {
        LeaderboardWeekViewModelFactory leaderboardWeekViewModelFactory = this.viewModelFactory;
        if (leaderboardWeekViewModelFactory != null) {
            return leaderboardWeekViewModelFactory;
        }
        u.s("viewModelFactory");
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i11, int i12, Intent intent) {
        super.onActivityResult(i11, i12, intent);
        if (i11 == SCAN_FRIEND_CODE_REQUEST_CODE || i11 == MY_QR_CODE_REQUEST_CODE) {
            BuildersKt__Builders_commonKt.launch$default(t.l(this), Dispatchers.getIO(), null, new LeaderboardActivity$onActivityResult$1(this, null), 2, null);
        }
    }

    @Override // com.withings.leaderboard.ui.Hilt_LeaderboardActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        l1.a(getWindow(), false);
        e.k.a(this, new s1.a(true, 1783429499, new LeaderboardActivity$onCreate$1(this)));
    }

    public final void setLeaderboardRemoteRepository(LeaderboardRemoteRepository leaderboardRemoteRepository) {
        u.j(leaderboardRemoteRepository, "<set-?>");
        this.leaderboardRemoteRepository = leaderboardRemoteRepository;
    }

    public final void setLeaderboardSyncJobFactory(LeaderboardSyncJobFactory leaderboardSyncJobFactory) {
        u.j(leaderboardSyncJobFactory, "<set-?>");
        this.leaderboardSyncJobFactory = leaderboardSyncJobFactory;
    }

    public final void setNetworkSyncManager(d dVar) {
        u.j(dVar, "<set-?>");
        this.networkSyncManager = dVar;
    }

    public final void setViewModelFactory(LeaderboardWeekViewModelFactory leaderboardWeekViewModelFactory) {
        u.j(leaderboardWeekViewModelFactory, "<set-?>");
        this.viewModelFactory = leaderboardWeekViewModelFactory;
    }
}
