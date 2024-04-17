package com.withings.wiscale2.legacyprograms;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.widget.Toolbar;
import androidx.camera.core.v;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.programs.model.enrolled.EnrolledIteration;
import com.withings.programs.model.program.ProgramDomain;
import com.withings.user.User;
import com.withings.wiscale2.C1987R;
import com.withings.wiscale2.device.hwa08.postinstall.b0;
import fn0.k;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.q0;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import m0.t;
import nm0.g;
import nm0.h;
/* compiled from: WellnessProgramArchiveActivity.kt */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u0000 72\u00020\u0001:\u000278B\u0007¢\u0006\u0004\b6\u0010\u0004J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0004J#\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\f\u0010\u0004J\u0019\u0010\u000f\u001a\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0014¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\"\u0010\u0017\u001a\u00020\u00168\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR#\u0010#\u001a\n \u001e*\u0004\u0018\u00010\u001d0\u001d8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R#\u0010(\u001a\n \u001e*\u0004\u0018\u00010$0$8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b%\u0010 \u001a\u0004\b&\u0010'R#\u0010-\u001a\n \u001e*\u0004\u0018\u00010)0)8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b*\u0010 \u001a\u0004\b+\u0010,R\u001b\u00103\u001a\u00020.8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u001c\u00104\u001a\b\u0012\u0004\u0012\u00020\t0\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105¨\u00069"}, d2 = {"Lcom/withings/wiscale2/legacyprograms/WellnessProgramArchiveActivity;", "Lcom/withings/android/activity/WithingsActivity;", "Lnm0/y;", "initToolbar", "()V", "loadArchivedProgramsAndInitViews", "", "Lcom/withings/programs/model/program/ProgramDomain;", "enrolledPrograms", "Lcom/withings/wiscale2/legacyprograms/WellnessProgramArchiveActivity$ProgramWithIteration;", "getArchivedEnrolledPrograms", "(Ljava/util/List;)Ljava/util/List;", "updateViews", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/MenuItem;", "item", "", "onOptionsItemSelected", "(Landroid/view/MenuItem;)Z", "Lx30/a;", "getAllEnrolledProgramByUserUseCase", "Lx30/a;", "getGetAllEnrolledProgramByUserUseCase", "()Lx30/a;", "setGetAllEnrolledProgramByUserUseCase", "(Lx30/a;)V", "Landroidx/appcompat/widget/Toolbar;", "kotlin.jvm.PlatformType", "toolbar$delegate", "Lnm0/g;", "getToolbar", "()Landroidx/appcompat/widget/Toolbar;", "toolbar", "Landroidx/recyclerview/widget/RecyclerView;", "archiveProgramsRecyclerView$delegate", "getArchiveProgramsRecyclerView", "()Landroidx/recyclerview/widget/RecyclerView;", "archiveProgramsRecyclerView", "Landroid/view/View;", "emptyStateContainer$delegate", "getEmptyStateContainer", "()Landroid/view/View;", "emptyStateContainer", "Lcom/withings/user/User;", "user$delegate", "Lbn0/d;", "getUser", "()Lcom/withings/user/User;", ConstantsWs.SCREEN_DISPLAY_CONTEXT_KEY_USER_SCREENS_SHORT, "archivedPrograms", "Ljava/util/List;", "<init>", "Companion", "ProgramWithIteration", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class WellnessProgramArchiveActivity extends Hilt_WellnessProgramArchiveActivity {
    public static final String EXTRA_USER = "extra_user";
    @Inject
    public x30.a getAllEnrolledProgramByUserUseCase;
    static final /* synthetic */ k<Object>[] $$delegatedProperties = {v.c(WellnessProgramArchiveActivity.class, ConstantsWs.SCREEN_DISPLAY_CONTEXT_KEY_USER_SCREENS_SHORT, "getUser()Lcom/withings/user/User;", 0)};
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private final g toolbar$delegate = h.b(new WellnessProgramArchiveActivity$toolbar$2(this));
    private final g archiveProgramsRecyclerView$delegate = h.b(new WellnessProgramArchiveActivity$archiveProgramsRecyclerView$2(this));
    private final g emptyStateContainer$delegate = h.b(new WellnessProgramArchiveActivity$emptyStateContainer$2(this));
    private final bn0.d user$delegate = new bn0.d<Activity, User>() { // from class: com.withings.wiscale2.legacyprograms.WellnessProgramArchiveActivity$special$$inlined$extra$1
        private final g value$delegate = h.b(new AnonymousClass1());

        /* compiled from: Activity.kt */
        @Metadata(d1 = {"\u0000\u0004\n\u0002\b\u0004\u0010\u0003\u001a\u00028\u0000\"\u0006\b\u0000\u0010\u0000\u0018\u0001H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"T", "invoke", "()Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.withings.wiscale2.legacyprograms.WellnessProgramArchiveActivity$special$$inlined$extra$1$1  reason: invalid class name */
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
    private List<ProgramWithIteration> archivedPrograms = new ArrayList();

    /* compiled from: WellnessProgramArchiveActivity.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/withings/wiscale2/legacyprograms/WellnessProgramArchiveActivity$Companion;", "", "()V", "EXTRA_USER", "", "createIntent", "Landroid/content/Intent;", ConstantsWs.JSON_ACCOUNT_KEY_CONTEXT, "Landroid/content/Context;", ConstantsWs.SCREEN_DISPLAY_CONTEXT_KEY_USER_SCREENS_SHORT, "Lcom/withings/user/User;", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Companion {
        public /* synthetic */ Companion(m mVar) {
            this();
        }

        public final Intent createIntent(Context context, User user) {
            u.j(context, "context");
            u.j(user, "user");
            Intent intent = new Intent(context, WellnessProgramArchiveActivity.class);
            intent.putExtra("extra_user", user);
            return intent;
        }

        private Companion() {
        }
    }

    /* compiled from: WellnessProgramArchiveActivity.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, d2 = {"Lcom/withings/wiscale2/legacyprograms/WellnessProgramArchiveActivity$ProgramWithIteration;", "", "program", "Lcom/withings/programs/model/program/ProgramDomain$LegacyDomain;", "iteration", "Lcom/withings/programs/model/enrolled/EnrolledIteration;", "(Lcom/withings/programs/model/program/ProgramDomain$LegacyDomain;Lcom/withings/programs/model/enrolled/EnrolledIteration;)V", "getIteration", "()Lcom/withings/programs/model/enrolled/EnrolledIteration;", "getProgram", "()Lcom/withings/programs/model/program/ProgramDomain$LegacyDomain;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class ProgramWithIteration {
        public static final int $stable = 8;
        private final EnrolledIteration iteration;
        private final ProgramDomain.LegacyDomain program;

        public ProgramWithIteration(ProgramDomain.LegacyDomain program, EnrolledIteration iteration) {
            u.j(program, "program");
            u.j(iteration, "iteration");
            this.program = program;
            this.iteration = iteration;
        }

        public static /* synthetic */ ProgramWithIteration copy$default(ProgramWithIteration programWithIteration, ProgramDomain.LegacyDomain legacyDomain, EnrolledIteration enrolledIteration, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                legacyDomain = programWithIteration.program;
            }
            if ((i11 & 2) != 0) {
                enrolledIteration = programWithIteration.iteration;
            }
            return programWithIteration.copy(legacyDomain, enrolledIteration);
        }

        public final ProgramDomain.LegacyDomain component1() {
            return this.program;
        }

        public final EnrolledIteration component2() {
            return this.iteration;
        }

        public final ProgramWithIteration copy(ProgramDomain.LegacyDomain program, EnrolledIteration iteration) {
            u.j(program, "program");
            u.j(iteration, "iteration");
            return new ProgramWithIteration(program, iteration);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ProgramWithIteration)) {
                return false;
            }
            ProgramWithIteration programWithIteration = (ProgramWithIteration) obj;
            if (u.e(this.program, programWithIteration.program) && u.e(this.iteration, programWithIteration.iteration)) {
                return true;
            }
            return false;
        }

        public final EnrolledIteration getIteration() {
            return this.iteration;
        }

        public final ProgramDomain.LegacyDomain getProgram() {
            return this.program;
        }

        public int hashCode() {
            return this.iteration.hashCode() + (this.program.hashCode() * 31);
        }

        public String toString() {
            ProgramDomain.LegacyDomain legacyDomain = this.program;
            EnrolledIteration enrolledIteration = this.iteration;
            return "ProgramWithIteration(program=" + legacyDomain + ", iteration=" + enrolledIteration + ")";
        }
    }

    private final RecyclerView getArchiveProgramsRecyclerView() {
        return (RecyclerView) this.archiveProgramsRecyclerView$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<ProgramWithIteration> getArchivedEnrolledPrograms(List<? extends ProgramDomain> list) {
        ArrayList arrayList = new ArrayList();
        ArrayList<ProgramDomain.LegacyDomain> arrayList2 = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof ProgramDomain.LegacyDomain) {
                arrayList2.add(obj);
            }
        }
        for (ProgramDomain.LegacyDomain legacyDomain : arrayList2) {
            List<EnrolledIteration> iterations = legacyDomain.getEnrolled().getIterations();
            if (iterations != null) {
                for (EnrolledIteration enrolledIteration : iterations) {
                    if (enrolledIteration.isFinishedOrArchived()) {
                        arrayList.add(new ProgramWithIteration(legacyDomain, enrolledIteration));
                    }
                }
            }
        }
        return arrayList;
    }

    private final View getEmptyStateContainer() {
        return (View) this.emptyStateContainer$delegate.getValue();
    }

    private final Toolbar getToolbar() {
        return (Toolbar) this.toolbar$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final User getUser() {
        return (User) this.user$delegate.getValue(this, $$delegatedProperties[0]);
    }

    private final void initToolbar() {
        setSupportActionBar(getToolbar());
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.o(true);
        }
    }

    private final void loadArchivedProgramsAndInitViews() {
        BuildersKt__Builders_commonKt.launch$default(t.l(this), null, null, new WellnessProgramArchiveActivity$loadArchivedProgramsAndInitViews$1(this, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateViews() {
        int i11;
        View emptyStateContainer = getEmptyStateContainer();
        u.i(emptyStateContainer, "<get-emptyStateContainer>(...)");
        int i12 = 8;
        if (this.archivedPrograms.isEmpty()) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        emptyStateContainer.setVisibility(i11);
        RecyclerView archiveProgramsRecyclerView = getArchiveProgramsRecyclerView();
        u.i(archiveProgramsRecyclerView, "<get-archiveProgramsRecyclerView>(...)");
        if (!this.archivedPrograms.isEmpty()) {
            i12 = 0;
        }
        archiveProgramsRecyclerView.setVisibility(i12);
        RecyclerView archiveProgramsRecyclerView2 = getArchiveProgramsRecyclerView();
        getArchiveProgramsRecyclerView().getContext();
        archiveProgramsRecyclerView2.setLayoutManager(new LinearLayoutManager(1));
        getArchiveProgramsRecyclerView().setHasFixedSize(false);
        getArchiveProgramsRecyclerView().setAdapter(new ProgramArchiveAdapter(this.archivedPrograms));
    }

    public final x30.a getGetAllEnrolledProgramByUserUseCase() {
        x30.a aVar = this.getAllEnrolledProgramByUserUseCase;
        if (aVar != null) {
            return aVar;
        }
        u.s("getAllEnrolledProgramByUserUseCase");
        throw null;
    }

    @Override // com.withings.wiscale2.legacyprograms.Hilt_WellnessProgramArchiveActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C1987R.layout.activity_programs_archive);
        initToolbar();
        loadArchivedProgramsAndInitViews();
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem item) {
        u.j(item, "item");
        if (item.getItemId() == 16908332) {
            finish();
        }
        return super.onOptionsItemSelected(item);
    }

    public final void setGetAllEnrolledProgramByUserUseCase(x30.a aVar) {
        u.j(aVar, "<set-?>");
        this.getAllEnrolledProgramByUserUseCase = aVar;
    }
}
