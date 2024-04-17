package com.withings.leaderboard.ui;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import androidx.appcompat.app.ActionBar;
import androidx.camera.core.d0;
import androidx.camera.core.f1;
import androidx.camera.core.r;
import androidx.camera.lifecycle.e;
import androidx.camera.view.PreviewView;
import androidx.core.content.a;
import androidx.lifecycle.g1;
import androidx.lifecycle.h1;
import androidx.lifecycle.i1;
import androidx.lifecycle.k0;
import com.google.common.util.concurrent.i;
import com.withings.authentication.n;
import com.withings.leaderboard.databinding.ActivityLeaderboardScanCodeBinding;
import com.withings.leaderboard.domain.LeaderboardSyncJobFactory;
import com.withings.leaderboard.repositories.webservice.LeaderboardRemoteRepository;
import com.withings.leaderboard.utils.QRCodeAnalyzer;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.user.core.models.User;
import e0.f0;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.q0;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
import nm0.g;
import nm0.y;
import org.joda.time.DateTime;
import r70.c;
import t00.d;
/* compiled from: ScanFriendCodeActivity.kt */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 '2\u00020\u0001:\u0002'(B\u0007¢\u0006\u0004\b&\u0010\u0004J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0006\u0010\u0004J\u0019\u0010\t\u001a\u00020\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0014¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0010\u0010\u0004J/\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00112\u000e\u0010\u0015\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00140\u00132\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001b\u001a\u00020\u001a8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u001b\u0010\"\u001a\u00020\u001d8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0016\u0010$\u001a\u00020#8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006)"}, d2 = {"Lcom/withings/leaderboard/ui/ScanFriendCodeActivity;", "Lcom/withings/android/activity/WithingsActivity;", "Lnm0/y;", "initToolbar", "()V", "startCameraSafely", "startCamera", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/MenuItem;", "item", "", "onOptionsItemSelected", "(Landroid/view/MenuItem;)Z", "onDestroy", "", "requestCode", "", "", "permissions", "", "grantResults", "onRequestPermissionsResult", "(I[Ljava/lang/String;[I)V", "Lcom/withings/leaderboard/databinding/ActivityLeaderboardScanCodeBinding;", "binding", "Lcom/withings/leaderboard/databinding/ActivityLeaderboardScanCodeBinding;", "Lcom/withings/leaderboard/ui/ScanFriendCodeActivity$ScanFriendCodeViewModel;", "viewModel$delegate", "Lnm0/g;", "getViewModel", "()Lcom/withings/leaderboard/ui/ScanFriendCodeActivity$ScanFriendCodeViewModel;", "viewModel", "Ljava/util/concurrent/ExecutorService;", "cameraExecutor", "Ljava/util/concurrent/ExecutorService;", "<init>", "Companion", "ScanFriendCodeViewModel", "leaderboard_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class ScanFriendCodeActivity extends Hilt_ScanFriendCodeActivity {
    private static final int CAMERA_REQUEST_CODE = 1234;
    private ActivityLeaderboardScanCodeBinding binding;
    private ExecutorService cameraExecutor;
    private final g viewModel$delegate = new i1(q0.b(ScanFriendCodeViewModel.class), new ScanFriendCodeActivity$special$$inlined$viewModels$default$2(this), new ScanFriendCodeActivity$special$$inlined$viewModels$default$1(this), new ScanFriendCodeActivity$special$$inlined$viewModels$default$3(null, this));
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: ScanFriendCodeActivity.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/withings/leaderboard/ui/ScanFriendCodeActivity$Companion;", "", "()V", "CAMERA_REQUEST_CODE", "", "createIntent", "Landroid/content/Intent;", ConstantsWs.JSON_ACCOUNT_KEY_CONTEXT, "Landroid/content/Context;", "leaderboard_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(m mVar) {
            this();
        }

        public final Intent createIntent(Context context) {
            return n.a(context, ConstantsWs.JSON_ACCOUNT_KEY_CONTEXT, context, ScanFriendCodeActivity.class);
        }

        private Companion() {
        }
    }

    /* compiled from: ScanFriendCodeActivity.kt */
    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B)\b\u0007\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b \u0010!J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0082@¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\n\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R*\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001f¨\u0006\""}, d2 = {"Lcom/withings/leaderboard/ui/ScanFriendCodeActivity$ScanFriendCodeViewModel;", "Landroidx/lifecycle/g1;", "Lcom/withings/user/core/models/User;", ConstantsWs.SCREEN_DISPLAY_CONTEXT_KEY_USER_SCREENS_SHORT, "Lnm0/y;", "syncLeaderboard", "(Lcom/withings/user/core/models/User;Lqm0/d;)Ljava/lang/Object;", "", "userName", "friendHash", "makeFriends", "(Ljava/lang/String;Ljava/lang/String;)V", "Lr70/c;", "userRepository", "Lr70/c;", "Lcom/withings/leaderboard/repositories/webservice/LeaderboardRemoteRepository;", "remoteRepository", "Lcom/withings/leaderboard/repositories/webservice/LeaderboardRemoteRepository;", "Lcom/withings/leaderboard/domain/LeaderboardSyncJobFactory;", "leaderboardSyncJobFactory", "Lcom/withings/leaderboard/domain/LeaderboardSyncJobFactory;", "Lt00/d;", "networkSyncManager", "Lt00/d;", "Landroidx/lifecycle/k0;", "Lcom/withings/leaderboard/ui/BecomeFriendsResult;", "becomeFriendsLiveData", "Landroidx/lifecycle/k0;", "getBecomeFriendsLiveData", "()Landroidx/lifecycle/k0;", "setBecomeFriendsLiveData", "(Landroidx/lifecycle/k0;)V", "<init>", "(Lr70/c;Lcom/withings/leaderboard/repositories/webservice/LeaderboardRemoteRepository;Lcom/withings/leaderboard/domain/LeaderboardSyncJobFactory;Lt00/d;)V", "leaderboard_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes3.dex */
    public static final class ScanFriendCodeViewModel extends g1 {
        public static final int $stable = 8;
        private k0<BecomeFriendsResult> becomeFriendsLiveData;
        private final LeaderboardSyncJobFactory leaderboardSyncJobFactory;
        private final d networkSyncManager;
        private final LeaderboardRemoteRepository remoteRepository;
        private final c userRepository;

        @Inject
        public ScanFriendCodeViewModel(c userRepository, LeaderboardRemoteRepository remoteRepository, LeaderboardSyncJobFactory leaderboardSyncJobFactory, d networkSyncManager) {
            u.j(userRepository, "userRepository");
            u.j(remoteRepository, "remoteRepository");
            u.j(leaderboardSyncJobFactory, "leaderboardSyncJobFactory");
            u.j(networkSyncManager, "networkSyncManager");
            this.userRepository = userRepository;
            this.remoteRepository = remoteRepository;
            this.leaderboardSyncJobFactory = leaderboardSyncJobFactory;
            this.networkSyncManager = networkSyncManager;
            this.becomeFriendsLiveData = xw.d.b(null);
        }

        public final Object syncLeaderboard(User user, qm0.d<? super y> dVar) {
            d dVar2 = this.networkSyncManager;
            LeaderboardSyncJobFactory leaderboardSyncJobFactory = this.leaderboardSyncJobFactory;
            long id2 = user.getId();
            DateTime minusDays = DateTime.now().minusDays(1);
            u.i(minusDays, "minusDays(...)");
            DateTime now = DateTime.now();
            u.i(now, "now(...)");
            Object a11 = t00.g.a(dVar2, leaderboardSyncJobFactory.create(id2, minusDays, now, true), "makeFriends", dVar);
            if (a11 == CoroutineSingletons.f76214a) {
                return a11;
            }
            return y.f85009a;
        }

        public final k0<BecomeFriendsResult> getBecomeFriendsLiveData() {
            return this.becomeFriendsLiveData;
        }

        public final void makeFriends(String userName, String friendHash) {
            u.j(userName, "userName");
            u.j(friendHash, "friendHash");
            BuildersKt__Builders_commonKt.launch$default(h1.a(this), Dispatchers.getIO(), null, new ScanFriendCodeActivity$ScanFriendCodeViewModel$makeFriends$1(this, friendHash, userName, null), 2, null);
        }

        public final void setBecomeFriendsLiveData(k0<BecomeFriendsResult> k0Var) {
            u.j(k0Var, "<set-?>");
            this.becomeFriendsLiveData = k0Var;
        }
    }

    public final ScanFriendCodeViewModel getViewModel() {
        return (ScanFriendCodeViewModel) this.viewModel$delegate.getValue();
    }

    private final void initToolbar() {
        ActivityLeaderboardScanCodeBinding activityLeaderboardScanCodeBinding = this.binding;
        if (activityLeaderboardScanCodeBinding != null) {
            setSupportActionBar(activityLeaderboardScanCodeBinding.toolbar);
            ActionBar supportActionBar = getSupportActionBar();
            if (supportActionBar != null) {
                supportActionBar.o(true);
                return;
            }
            return;
        }
        u.s("binding");
        throw null;
    }

    public static final void onCreate$lambda$1(ScanFriendCodeActivity this$0) {
        u.j(this$0, "this$0");
        this$0.startCameraSafely();
    }

    private final void startCamera() {
        ActivityLeaderboardScanCodeBinding activityLeaderboardScanCodeBinding = this.binding;
        if (activityLeaderboardScanCodeBinding != null) {
            int rotation = activityLeaderboardScanCodeBinding.preview.getDisplay().getRotation();
            f1.a aVar = new f1.a();
            aVar.i();
            aVar.k(rotation);
            f1 c11 = aVar.c();
            d0 c12 = new d0.c().c();
            ExecutorService executorService = this.cameraExecutor;
            if (executorService != null) {
                c12.V(executorService, new QRCodeAnalyzer(new ScanFriendCodeActivity$startCamera$imageAnalyzer$1$1(this)));
                i<e> d11 = e.d(this);
                ((z.d) d11).a(new f7.i(d11, this, c11, c12, 1), a.getMainExecutor(this));
                return;
            }
            u.s("cameraExecutor");
            throw null;
        }
        u.s("binding");
        throw null;
    }

    public static final void startCamera$lambda$3(i cameraProviderFuture, ScanFriendCodeActivity this$0, f1 preview, d0 imageAnalyzer) {
        u.j(cameraProviderFuture, "$cameraProviderFuture");
        u.j(this$0, "this$0");
        u.j(preview, "$preview");
        u.j(imageAnalyzer, "$imageAnalyzer");
        e eVar = (e) cameraProviderFuture.get();
        ActivityLeaderboardScanCodeBinding activityLeaderboardScanCodeBinding = this$0.binding;
        if (activityLeaderboardScanCodeBinding != null) {
            activityLeaderboardScanCodeBinding.preview.setImplementationMode(PreviewView.ImplementationMode.PERFORMANCE);
            eVar.c(this$0, r.f3355c, preview, imageAnalyzer);
            ActivityLeaderboardScanCodeBinding activityLeaderboardScanCodeBinding2 = this$0.binding;
            if (activityLeaderboardScanCodeBinding2 != null) {
                preview.V(activityLeaderboardScanCodeBinding2.preview.getSurfaceProvider());
                return;
            } else {
                u.s("binding");
                throw null;
            }
        }
        u.s("binding");
        throw null;
    }

    private final void startCameraSafely() {
        if (a.checkSelfPermission(this, "android.permission.CAMERA") != 0) {
            androidx.core.app.a.d(this, new String[]{"android.permission.CAMERA"}, CAMERA_REQUEST_CODE);
        } else {
            startCamera();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.withings.leaderboard.ui.Hilt_ScanFriendCodeActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ActivityLeaderboardScanCodeBinding inflate = ActivityLeaderboardScanCodeBinding.inflate(getLayoutInflater());
        u.i(inflate, "inflate(...)");
        this.binding = inflate;
        setContentView(inflate.getRoot());
        initToolbar();
        xw.d.c(this, getViewModel().getBecomeFriendsLiveData(), new ScanFriendCodeActivity$onCreate$1$1(this));
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
        u.i(newSingleThreadExecutor, "newSingleThreadExecutor(...)");
        this.cameraExecutor = newSingleThreadExecutor;
        ActivityLeaderboardScanCodeBinding activityLeaderboardScanCodeBinding = this.binding;
        if (activityLeaderboardScanCodeBinding != null) {
            activityLeaderboardScanCodeBinding.preview.post(new f0(this, 6));
        } else {
            u.s("binding");
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.withings.leaderboard.ui.Hilt_ScanFriendCodeActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        ExecutorService executorService = this.cameraExecutor;
        if (executorService != null) {
            executorService.shutdown();
            super.onDestroy();
            return;
        }
        u.s("cameraExecutor");
        throw null;
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem item) {
        u.j(item, "item");
        if (item.getItemId() == 16908332) {
            finish();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i11, String[] permissions, int[] grantResults) {
        u.j(permissions, "permissions");
        u.j(grantResults, "grantResults");
        super.onRequestPermissionsResult(i11, permissions, grantResults);
        if (i11 == CAMERA_REQUEST_CODE) {
            if (grantResults[0] != 0) {
                finish();
            } else {
                startCamera();
            }
        }
    }
}
