package com.withings.wiscale2.legacyprograms;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.Menu;
import android.view.MenuItem;
import androidx.appcompat.app.ActionBar;
import androidx.camera.core.v;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.l1;
import androidx.recyclerview.widget.RecyclerView;
import by.kirich1409.viewbindingdelegate.f;
import com.google.android.material.appbar.AppBarLayout;
import com.withings.coach.chatbot.ChatbotActivity;
import com.withings.healthplus.navigation.ui.navigation.NavigationArguments;
import com.withings.insight.android.entity.Insight;
import com.withings.insight.android.entity.InsightContent;
import com.withings.leaderboard.ui.LeaderboardActivity;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.programs.model.program.ProgramDomain;
import com.withings.user.User;
import com.withings.wiscale2.C1987R;
import com.withings.wiscale2.device.hwa08.postinstall.b0;
import dp0.j;
import fn0.k;
import java.io.Serializable;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.q0;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import nm0.g;
import nm0.h;
/* compiled from: BrowseProgramActivity.kt */
@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 F2\u00020\u00012\u00020\u0002:\u0001FB\u0007¢\u0006\u0004\bE\u0010\u0005J\u000f\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0006\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0007\u0010\u0005J\u000f\u0010\b\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\b\u0010\u0005J\u001d\u0010\f\u001a\u00020\u00032\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u0010\u001a\u00020\u00032\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0014¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\u0012\u0010\u0005J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001e\u001a\u00020\u00032\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ'\u0010%\u001a\u00020\u00032\u0006\u0010 \u001a\u00020\u00152\u0006\u0010\"\u001a\u00020!2\u0006\u0010$\u001a\u00020#H\u0016¢\u0006\u0004\b%\u0010&R\"\u0010(\u001a\u00020'8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\u001b\u00103\u001a\u00020.8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u001b\u00109\u001a\u0002048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R\u001b\u0010?\u001a\u00020:8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>R\u001b\u0010D\u001a\u00020@8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bA\u0010<\u001a\u0004\bB\u0010C¨\u0006G"}, d2 = {"Lcom/withings/wiscale2/legacyprograms/BrowseProgramActivity;", "Lcom/withings/android/activity/WithingsActivity;", "Lcom/withings/wiscale2/legacyprograms/ProgramClickListener;", "Lnm0/y;", "initToolbar", "()V", "initRecyclerViews", "initSwipeToRefresh", "initViewModel", "", "", "programs", "updateProgramList", "(Ljava/util/List;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "onResume", "Landroid/view/Menu;", "menu", "", "onCreateOptionsMenu", "(Landroid/view/Menu;)Z", "Landroid/view/MenuItem;", "item", "onOptionsItemSelected", "(Landroid/view/MenuItem;)Z", "Lcom/withings/programs/model/program/ProgramDomain$LegacyDomain;", "wellnessProgram", "onProgramClicked", "(Lcom/withings/programs/model/program/ProgramDomain$LegacyDomain;)V", "isFinished", "", NavigationArguments.PROGRAM_ID, "", "url", "onOnGoingProgramClicked", "(ZILjava/lang/String;)V", "Lcom/withings/wiscale2/legacyprograms/BrowseProgramViewModelFactory;", "browseProgramViewModelFactory", "Lcom/withings/wiscale2/legacyprograms/BrowseProgramViewModelFactory;", "getBrowseProgramViewModelFactory", "()Lcom/withings/wiscale2/legacyprograms/BrowseProgramViewModelFactory;", "setBrowseProgramViewModelFactory", "(Lcom/withings/wiscale2/legacyprograms/BrowseProgramViewModelFactory;)V", "Lcom/withings/user/User;", "user$delegate", "Lbn0/d;", "getUser", "()Lcom/withings/user/User;", ConstantsWs.SCREEN_DISPLAY_CONTEXT_KEY_USER_SCREENS_SHORT, "Ltb0/d;", "binding$delegate", "Lby/kirich1409/viewbindingdelegate/f;", "getBinding", "()Ltb0/d;", "binding", "Lcom/withings/wiscale2/legacyprograms/WellnessProgramsAdapter;", "wellnessProgramsAdapter$delegate", "Lnm0/g;", "getWellnessProgramsAdapter", "()Lcom/withings/wiscale2/legacyprograms/WellnessProgramsAdapter;", "wellnessProgramsAdapter", "Lcom/withings/wiscale2/legacyprograms/BrowseProgramViewModel;", "viewModel$delegate", "getViewModel", "()Lcom/withings/wiscale2/legacyprograms/BrowseProgramViewModel;", "viewModel", "<init>", "Companion", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class BrowseProgramActivity extends Hilt_BrowseProgramActivity implements ProgramClickListener {
    private static final String EXTRA_USER = "EXTRA_USER";
    private final f binding$delegate;
    @Inject
    public BrowseProgramViewModelFactory browseProgramViewModelFactory;
    private final bn0.d user$delegate;
    private final g viewModel$delegate;
    private final g wellnessProgramsAdapter$delegate;
    static final /* synthetic */ k<Object>[] $$delegatedProperties = {v.c(BrowseProgramActivity.class, ConstantsWs.SCREEN_DISPLAY_CONTEXT_KEY_USER_SCREENS_SHORT, "getUser()Lcom/withings/user/User;", 0), v.c(BrowseProgramActivity.class, "binding", "getBinding()Lcom/withings/wiscale2/databinding/ActivityBrowseProgramBinding;", 0)};
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: BrowseProgramActivity.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/withings/wiscale2/legacyprograms/BrowseProgramActivity$Companion;", "", "()V", BrowseProgramActivity.EXTRA_USER, "", "createIntent", "Landroid/content/Intent;", ConstantsWs.JSON_ACCOUNT_KEY_CONTEXT, "Landroid/content/Context;", ConstantsWs.SCREEN_DISPLAY_CONTEXT_KEY_USER_SCREENS_SHORT, "Lcom/withings/user/User;", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Companion {
        public /* synthetic */ Companion(m mVar) {
            this();
        }

        public final Intent createIntent(Context context, User user) {
            u.j(context, "context");
            u.j(user, "user");
            Intent putExtra = new Intent(context, BrowseProgramActivity.class).putExtra(BrowseProgramActivity.EXTRA_USER, user);
            u.i(putExtra, "putExtra(...)");
            return putExtra;
        }

        private Companion() {
        }
    }

    public BrowseProgramActivity() {
        super(C1987R.layout.activity_browse_program);
        this.user$delegate = new bn0.d<Activity, User>() { // from class: com.withings.wiscale2.legacyprograms.BrowseProgramActivity$special$$inlined$extra$1
            private final g value$delegate = h.b(new AnonymousClass1());

            /* compiled from: Activity.kt */
            @Metadata(d1 = {"\u0000\u0004\n\u0002\b\u0004\u0010\u0003\u001a\u00028\u0000\"\u0006\b\u0000\u0010\u0000\u0018\u0001H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"T", "invoke", "()Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
            /* renamed from: com.withings.wiscale2.legacyprograms.BrowseProgramActivity$special$$inlined$extra$1$1  reason: invalid class name */
            /* loaded from: classes5.dex */
            public static final class AnonymousClass1 extends w implements ym0.a<User> {
                public AnonymousClass1() {
                    super(0);
                }

                /* JADX WARN: Type inference failed for: r0v1, types: [com.withings.user.User, java.lang.Object] */
                @Override // ym0.a
                public final User invoke() {
                    return getExtra();
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final User getExtra() {
                if (Parcelable.class.isAssignableFrom(User.class)) {
                    return (User) b0.F(this, r2);
                }
                if (Serializable.class.isAssignableFrom(User.class)) {
                    return (User) b0.H(this, r2);
                }
                String str = r2;
                fn0.d b10 = q0.b(User.class);
                throw new IllegalArgumentException("extra " + str + " of class " + b10 + " is not supported");
            }

            /* JADX WARN: Type inference failed for: r2v2, types: [com.withings.user.User, java.lang.Object] */
            /* renamed from: getValue  reason: avoid collision after fix types in other method */
            public User getValue2(Activity thisRef, k<?> property) {
                u.j(thisRef, "thisRef");
                u.j(property, "property");
                return getValue();
            }

            /* JADX WARN: Type inference failed for: r1v2, types: [com.withings.user.User, java.lang.Object] */
            @Override // bn0.d
            public /* bridge */ /* synthetic */ User getValue(Activity activity, k kVar) {
                return getValue2(activity, (k<?>) kVar);
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [com.withings.user.User, java.lang.Object] */
            public final User getValue() {
                return this.value$delegate.getValue();
            }
        };
        this.binding$delegate = by.kirich1409.viewbindingdelegate.b.a(this, u9.a.a(), new BrowseProgramActivity$special$$inlined$viewBindingActivity$1(C1987R.id.container));
        this.wellnessProgramsAdapter$delegate = h.b(new BrowseProgramActivity$wellnessProgramsAdapter$2(this));
        this.viewModel$delegate = h.b(new BrowseProgramActivity$viewModel$2(this));
    }

    private final tb0.d getBinding() {
        T value = this.binding$delegate.getValue(this, $$delegatedProperties[1]);
        u.i(value, "getValue(...)");
        return (tb0.d) value;
    }

    private final BrowseProgramViewModel getViewModel() {
        return (BrowseProgramViewModel) this.viewModel$delegate.getValue();
    }

    private final WellnessProgramsAdapter getWellnessProgramsAdapter() {
        return (WellnessProgramsAdapter) this.wellnessProgramsAdapter$delegate.getValue();
    }

    private final void initRecyclerViews() {
        getBinding().f98942c.setAdapter(getWellnessProgramsAdapter());
    }

    private final void initSwipeToRefresh() {
        getBinding().f98943d.setOnRefreshListener(new t.u(this, 6));
    }

    public static final void initSwipeToRefresh$lambda$1(BrowseProgramActivity this$0) {
        u.j(this$0, "this$0");
        this$0.getViewModel().synchronizeEnrolledPrograms("pullToRefreshPrograms");
    }

    private final void initToolbar() {
        setSupportActionBar(getBinding().f98944e);
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.o(true);
            supportActionBar.p(true);
            supportActionBar.q(true);
        }
    }

    private final void initViewModel() {
        xw.d.c(this, getViewModel().getRemainingProgramsItems(), new BrowseProgramActivity$initViewModel$1(this));
    }

    public final void updateProgramList(List<? extends Object> list) {
        int i11;
        int i12 = 0;
        getBinding().f98943d.setRefreshing(false);
        RecyclerView programRecyclerView = getBinding().f98942c;
        u.i(programRecyclerView, "programRecyclerView");
        if (!list.isEmpty()) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        programRecyclerView.setVisibility(i11);
        ConstraintLayout b10 = getBinding().f98941b.b();
        u.i(b10, "getRoot(...)");
        if (!list.isEmpty()) {
            i12 = 8;
        }
        b10.setVisibility(i12);
        getWellnessProgramsAdapter().setHasOngoingPrograms(list.isEmpty());
        getWellnessProgramsAdapter().setProgramsItems(list);
    }

    public static /* synthetic */ void z3(BrowseProgramActivity browseProgramActivity) {
        initSwipeToRefresh$lambda$1(browseProgramActivity);
    }

    public final BrowseProgramViewModelFactory getBrowseProgramViewModelFactory() {
        BrowseProgramViewModelFactory browseProgramViewModelFactory = this.browseProgramViewModelFactory;
        if (browseProgramViewModelFactory != null) {
            return browseProgramViewModelFactory;
        }
        u.s("browseProgramViewModelFactory");
        throw null;
    }

    public final User getUser() {
        return (User) this.user$delegate.getValue(this, $$delegatedProperties[0]);
    }

    @Override // com.withings.wiscale2.legacyprograms.Hilt_BrowseProgramActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        l1.a(getWindow(), false);
        initToolbar();
        initRecyclerViews();
        initSwipeToRefresh();
        initViewModel();
        AppBarLayout appBar = getBinding().f98940a;
        u.i(appBar, "appBar");
        ay.b.n(appBar, true, false, 29);
        RecyclerView programRecyclerView = getBinding().f98942c;
        u.i(programRecyclerView, "programRecyclerView");
        ay.b.n(programRecyclerView, false, true, 23);
        AppBarLayout appBar2 = getBinding().f98940a;
        u.i(appBar2, "appBar");
        RecyclerView programRecyclerView2 = getBinding().f98942c;
        u.i(programRecyclerView2, "programRecyclerView");
        Context context = getBinding().f98940a.getContext();
        u.i(context, "getContext(...)");
        j80.e.a(appBar2, programRecyclerView2, new j80.g(context));
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        u.j(menu, "menu");
        getMenuInflater().inflate(C1987R.menu.menu_wellness_programs, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override // com.withings.wiscale2.legacyprograms.ProgramClickListener
    public void onOnGoingProgramClicked(boolean z5, int i11, String url) {
        u.j(url, "url");
        if (j.r(url, BrowseProgramViewModel.HY_RESULT_TARGET_VALUE, false)) {
            return;
        }
        if (j.r(url, BrowseProgramViewModel.HCONV_EXTENSION, false)) {
            ChatbotActivity.a aVar = ChatbotActivity.G;
            long q11 = getUser().q();
            aVar.getClass();
            Intent putExtra = new Intent(this, ChatbotActivity.class).putExtra("EXTRA_INSIGHT", new Insight("", null, -1L, q11, null, null, null, "", null, null, new InsightContent("", "", null, url, null, 4, null), null, false, null, null, false, false, 0L, 0L, false, null, null, null, null, 16776050, null));
            u.i(putExtra, "putExtra(...)");
            startActivity(putExtra);
        } else if (j.r(url, BrowseProgramViewModel.LEADERBOARD_TARGET_VALUE, false)) {
            startActivity(LeaderboardActivity.Companion.createIntent$default(LeaderboardActivity.Companion, this, getUser().q(), null, 4, null));
        } else if (z5) {
            getViewModel().archiveProgram(i11);
        } else if (url.length() > 0) {
            startActivity(WellnessProgramWebActivity.Companion.createIntent(this, getUser().q(), i11, url));
        }
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem item) {
        u.j(item, "item");
        int itemId = item.getItemId();
        if (itemId == C1987R.id.action_wellness_programs_archive) {
            startActivity(WellnessProgramArchiveActivity.Companion.createIntent(this, getUser()));
        } else if (itemId == 16908332) {
            finish();
        }
        return super.onOptionsItemSelected(item);
    }

    @Override // com.withings.wiscale2.legacyprograms.ProgramClickListener
    public void onProgramClicked(ProgramDomain.LegacyDomain wellnessProgram) {
        u.j(wellnessProgram, "wellnessProgram");
        startActivity(WellnessProgramDetailsActivity.Companion.createIntent(this, getUser(), wellnessProgram.getProgramId()));
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        getViewModel().getRefreshLiveData().postValue(Boolean.TRUE);
        v70.a.c("programs", null, 6);
    }

    public final void setBrowseProgramViewModelFactory(BrowseProgramViewModelFactory browseProgramViewModelFactory) {
        u.j(browseProgramViewModelFactory, "<set-?>");
        this.browseProgramViewModelFactory = browseProgramViewModelFactory;
    }
}
