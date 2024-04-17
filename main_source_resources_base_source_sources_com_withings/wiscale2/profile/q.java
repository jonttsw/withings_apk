package com.withings.wiscale2.profile;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Scope;
import com.google.android.material.appbar.AppBarLayout;
import com.withings.account.core.repositories.AccountSessionRepository;
import com.withings.common.compose.component.AvatarSize;
import com.withings.features.FeatureFlag;
import com.withings.partner.model.Partner;
import com.withings.partner.model.PartnerAssociationStatusLoader;
import com.withings.reminder.details.ReminderDetailsActivity;
import com.withings.reminder.di.ReminderModule;
import com.withings.reminder.discovery.RemindersDiscoveryActivity;
import com.withings.reminder.model.Reminder;
import com.withings.reminder.model.ReminderRepository;
import com.withings.reminder.profile.ReminderListener;
import com.withings.reminder.profile.RemindersSectionView;
import com.withings.user.User;
import com.withings.views.widget.LineCellView;
import com.withings.wiscale2.C1987R;
import com.withings.wiscale2.profile.ProfileTargetView;
import com.withings.wiscale2.profile.ProfileUsersView;
import com.withings.wiscale2.profile.v0;
import com.withings.wiscale2.settings.SettingsActivity;
import com.withings.wiscale2.user.ui.profile.EditProfileActivity;
import java.util.Arrays;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
/* compiled from: ProfileFragment.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005:\u0001\bB\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/withings/wiscale2/profile/q;", "Landroidx/fragment/app/Fragment;", "Lcom/withings/wiscale2/profile/ProfileTargetView$a;", "Lcom/withings/wiscale2/profile/ProfileUsersView$a;", "Lcom/withings/wiscale2/profile/v0$a;", "Lcom/withings/reminder/profile/ReminderListener;", "<init>", "()V", "a", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class q extends j implements ProfileTargetView.a, ProfileUsersView.a, v0.a, ReminderListener {
    private ViewGroup A;
    private ProfileMedicalReportView B;
    private ImageView F;
    @Inject
    public c1 G;
    @Inject
    public ch.d M;
    @Inject
    public kg0.c P;
    private final androidx.activity.result.b<Intent> Q;

    /* renamed from: h  reason: collision with root package name */
    private y0 f59424h;

    /* renamed from: i  reason: collision with root package name */
    private final f f59425i = new f(this);

    /* renamed from: j  reason: collision with root package name */
    private boolean f59426j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f59427k;

    /* renamed from: l  reason: collision with root package name */
    private androidx.appcompat.app.c f59428l;

    /* renamed from: m  reason: collision with root package name */
    private Toolbar f59429m;

    /* renamed from: n  reason: collision with root package name */
    private AppBarLayout f59430n;

    /* renamed from: o  reason: collision with root package name */
    private ConstraintLayout f59431o;

    /* renamed from: p  reason: collision with root package name */
    private TextView f59432p;

    /* renamed from: q  reason: collision with root package name */
    private ComposeView f59433q;

    /* renamed from: r  reason: collision with root package name */
    private Button f59434r;

    /* renamed from: s  reason: collision with root package name */
    private ComposeView f59435s;

    /* renamed from: t  reason: collision with root package name */
    private ProfileTargetView f59436t;

    /* renamed from: u  reason: collision with root package name */
    private View f59437u;

    /* renamed from: v  reason: collision with root package name */
    private RecyclerView f59438v;

    /* renamed from: w  reason: collision with root package name */
    private ProfileUsersView f59439w;

    /* renamed from: x  reason: collision with root package name */
    private RemindersSectionView f59440x;

    /* renamed from: y  reason: collision with root package name */
    private NestedScrollView f59441y;

    /* renamed from: z  reason: collision with root package name */
    private View f59442z;
    static final /* synthetic */ fn0.k<Object>[] S = {androidx.camera.core.v.c(q.class, "mainUser", "getMainUser()Lcom/withings/user/User;", 0)};
    public static final a R = new Object();

    /* compiled from: ProfileFragment.kt */
    /* loaded from: classes5.dex */
    public static final class a {
    }

    /* compiled from: ProfileFragment.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.profile.ProfileFragment$onPartnerClicked$1", f = "ProfileFragment.kt", l = {410}, m = "invokeSuspend")
    /* loaded from: classes5.dex */
    static final class b extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f59443a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Partner f59444b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ q f59445c;

        /* compiled from: ProfileFragment.kt */
        /* loaded from: classes5.dex */
        public /* synthetic */ class a {

            /* renamed from: a  reason: collision with root package name */
            public static final /* synthetic */ int[] f59446a;

            static {
                int[] iArr = new int[PartnerAssociationStatusLoader.AssociationStatus.values().length];
                try {
                    PartnerAssociationStatusLoader.AssociationStatus associationStatus = PartnerAssociationStatusLoader.AssociationStatus.f43515a;
                    iArr[2] = 1;
                } catch (NoSuchFieldError unused) {
                }
                f59446a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Partner partner, q qVar, qm0.d<? super b> dVar) {
            super(2, dVar);
            this.f59444b = partner;
            this.f59445c = qVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
            return new b(this.f59444b, this.f59445c, dVar);
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
            return ((b) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            int i11 = this.f59443a;
            if (i11 != 0) {
                if (i11 == 1) {
                    nm0.l.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                nm0.l.b(obj);
                Partner partner = this.f59444b;
                int i12 = a.f59446a[partner.e().ordinal()];
                q qVar = this.f59445c;
                if (i12 == 1) {
                    a aVar = q.R;
                    FragmentActivity requireActivity = qVar.requireActivity();
                    kotlin.jvm.internal.u.i(requireActivity, "requireActivity(...)");
                    nm0.j<GoogleSignInAccount, List<Scope>> a11 = v10.d.a(requireActivity);
                    FragmentActivity requireActivity2 = qVar.requireActivity();
                    Scope[] scopeArr = (Scope[]) a11.b().toArray(new Scope[0]);
                    GoogleSignIn.requestPermissions(requireActivity2, 4097, a11.a(), (Scope[]) Arrays.copyOf(scopeArr, scopeArr.length));
                } else {
                    this.f59443a = 1;
                    if (q.L1(partner, qVar, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
            }
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProfileFragment.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.profile.ProfileFragment", f = "ProfileFragment.kt", l = {435, 441}, m = "onStravaClicked")
    /* loaded from: classes5.dex */
    public static final class c extends kotlin.coroutines.jvm.internal.c {

        /* renamed from: a  reason: collision with root package name */
        q f59447a;

        /* renamed from: b  reason: collision with root package name */
        /* synthetic */ Object f59448b;

        /* renamed from: d  reason: collision with root package name */
        int f59450d;

        c(qm0.d<? super c> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f59448b = obj;
            this.f59450d |= Integer.MIN_VALUE;
            return q.this.S1(null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProfileFragment.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.profile.ProfileFragment$onStravaClicked$url$1", f = "ProfileFragment.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes5.dex */
    public static final class d extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super String>, Object> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ q f59451a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Partner f59452b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(Partner partner, q qVar, qm0.d dVar) {
            super(2, dVar);
            this.f59451a = qVar;
            this.f59452b = partner;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
            return new d(this.f59452b, this.f59451a, dVar);
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super String> dVar) {
            return ((d) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            vf.c cVar;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            nm0.l.b(obj);
            Context requireContext = this.f59451a.requireContext();
            kotlin.jvm.internal.u.i(requireContext, "requireContext(...)");
            cVar = vf.c.f103617d;
            if (cVar != null) {
                m70.i b10 = m70.i.b();
                kotlin.jvm.internal.u.i(b10, "get(...)");
                return new vh0.c(requireContext, this.f59452b, cVar, b10, AccountSessionRepository.a.a()).call();
            }
            throw new IllegalArgumentException("You must call init before".toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProfileFragment.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.profile.ProfileFragment$onStravaClicked$url$2", f = "ProfileFragment.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes5.dex */
    public static final class e extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super String>, Object> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ q f59453a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Partner f59454b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(Partner partner, q qVar, qm0.d dVar) {
            super(2, dVar);
            this.f59453a = qVar;
            this.f59454b = partner;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
            return new e(this.f59454b, this.f59453a, dVar);
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super String> dVar) {
            return ((e) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            vf.c cVar;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            nm0.l.b(obj);
            Context requireContext = this.f59453a.requireContext();
            kotlin.jvm.internal.u.i(requireContext, "requireContext(...)");
            cVar = vf.c.f103617d;
            if (cVar != null) {
                m70.i b10 = m70.i.b();
                kotlin.jvm.internal.u.i(b10, "get(...)");
                return new vh0.b(requireContext, this.f59454b, cVar, b10, AccountSessionRepository.a.a()).call();
            }
            throw new IllegalArgumentException("You must call init before".toString());
        }
    }

    /* compiled from: Fragment.kt */
    /* loaded from: classes5.dex */
    public static final class f implements bn0.d<Fragment, User> {

        /* renamed from: a  reason: collision with root package name */
        private final nm0.g f59455a = nm0.h.b(new t0(this));

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Fragment f59456b;

        public f(Fragment fragment) {
            this.f59456b = fragment;
        }

        /* JADX WARN: Type inference failed for: r2v4, types: [com.withings.user.User, java.lang.Object] */
        @Override // bn0.d
        public final User getValue(Fragment fragment, fn0.k property) {
            Fragment thisRef = fragment;
            kotlin.jvm.internal.u.j(thisRef, "thisRef");
            kotlin.jvm.internal.u.j(property, "property");
            return this.f59455a.getValue();
        }
    }

    public q() {
        androidx.activity.result.b<Intent> registerForActivityResult = registerForActivityResult(new g.a(), new com.withings.devicesetup.network.ui.a(this, 4));
        kotlin.jvm.internal.u.i(registerForActivityResult, "registerForActivityResult(...)");
        this.Q = registerForActivityResult;
    }

    public static final void I1(q qVar, List list) {
        androidx.appcompat.app.c cVar = qVar.f59428l;
        if (cVar != null) {
            cVar.dismiss();
        }
        if (list != null) {
            RemindersSectionView remindersSectionView = qVar.f59440x;
            if (remindersSectionView != null) {
                remindersSectionView.setReminders(list);
                if (qVar.f59426j) {
                    new Handler(Looper.getMainLooper()).postDelayed(new y(qVar), 500L);
                    qVar.f59426j = false;
                    return;
                }
                return;
            }
            kotlin.jvm.internal.u.s("reminderSectionView");
            throw null;
        }
    }

    public static final void J1(q qVar, List list) {
        int i11;
        qVar.getClass();
        List list2 = list;
        if (!list2.isEmpty()) {
            ProfileTargetView profileTargetView = qVar.f59436t;
            if (profileTargetView != null) {
                profileTargetView.c(qVar.R1(), list);
            } else {
                kotlin.jvm.internal.u.s("profileTargetView");
                throw null;
            }
        }
        ProfileTargetView profileTargetView2 = qVar.f59436t;
        if (profileTargetView2 != null) {
            if (!list2.isEmpty()) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            profileTargetView2.setVisibility(i11);
            return;
        }
        kotlin.jvm.internal.u.s("profileTargetView");
        throw null;
    }

    public static final Object L1(Partner partner, q qVar, qm0.d dVar) {
        qVar.getClass();
        if (partner.l() == Partner.f43463u.l()) {
            Object S1 = qVar.S1(partner, dVar);
            if (S1 != CoroutineSingletons.f76214a) {
                return nm0.y.f85009a;
            }
            return S1;
        }
        ch.d dVar2 = qVar.M;
        if (dVar2 != null) {
            ch.g a11 = dVar2.a();
            RecyclerView recyclerView = qVar.f59438v;
            if (recyclerView != null) {
                Context context = recyclerView.getContext();
                kotlin.jvm.internal.u.i(context, "getContext(...)");
                Intent b10 = ch.g.b(a11, context, partner.l(), false, 12);
                if (partner.l() == Partner.f43457o.l()) {
                    qVar.startActivity(b10);
                } else {
                    qVar.Q.a(b10);
                }
                return nm0.y.f85009a;
            }
            kotlin.jvm.internal.u.s("partnersRecycler");
            throw null;
        }
        kotlin.jvm.internal.u.s("intentBuilder");
        throw null;
    }

    public static final void M1(q qVar) {
        NestedScrollView nestedScrollView = qVar.f59441y;
        if (nestedScrollView != null) {
            int measuredHeight = nestedScrollView.getMeasuredHeight();
            RemindersSectionView remindersSectionView = qVar.f59440x;
            if (remindersSectionView != null) {
                int top = remindersSectionView.getTop();
                Toolbar toolbar = qVar.f59429m;
                if (toolbar != null) {
                    int measuredHeight2 = top - toolbar.getMeasuredHeight();
                    Context requireContext = qVar.requireContext();
                    kotlin.jvm.internal.u.i(requireContext, "requireContext(...)");
                    int h11 = measuredHeight2 - wq.a.h(requireContext);
                    RemindersSectionView remindersSectionView2 = qVar.f59440x;
                    if (remindersSectionView2 != null) {
                        if (remindersSectionView2.getMeasuredHeight() >= measuredHeight) {
                            RemindersSectionView remindersSectionView3 = qVar.f59440x;
                            if (remindersSectionView3 != null) {
                                h11 = remindersSectionView3.getBottom() - measuredHeight;
                            } else {
                                kotlin.jvm.internal.u.s("reminderSectionView");
                                throw null;
                            }
                        }
                        NestedScrollView nestedScrollView2 = qVar.f59441y;
                        if (nestedScrollView2 != null) {
                            nestedScrollView2.w(h11);
                            return;
                        } else {
                            kotlin.jvm.internal.u.s("scrollView");
                            throw null;
                        }
                    }
                    kotlin.jvm.internal.u.s("reminderSectionView");
                    throw null;
                }
                kotlin.jvm.internal.u.s("toolbar");
                throw null;
            }
            kotlin.jvm.internal.u.s("reminderSectionView");
            throw null;
        }
        kotlin.jvm.internal.u.s("scrollView");
        throw null;
    }

    public static final void N1(q qVar, List list) {
        boolean z5;
        ViewGroup viewGroup = qVar.A;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
            ViewGroup viewGroup2 = qVar.A;
            if (viewGroup2 != null) {
                viewGroup2.setVisibility(0);
                View view = qVar.f59442z;
                if (view != null) {
                    view.setVisibility(0);
                    int i11 = 0;
                    for (Object obj : list) {
                        int i12 = i11 + 1;
                        if (i11 >= 0) {
                            com.withings.wiscale2.profile.b bVar = (com.withings.wiscale2.profile.b) obj;
                            if (i11 != list.size() - 1) {
                                z5 = true;
                            } else {
                                z5 = false;
                            }
                            ViewGroup viewGroup3 = qVar.A;
                            if (viewGroup3 != null) {
                                Context context = viewGroup3.getContext();
                                LineCellView lineCellView = new LineCellView(context);
                                lineCellView.setLabel(context.getString(bVar.c()));
                                lineCellView.setValue(bVar.a());
                                lineCellView.setBottomDividerVisibility(z5);
                                if (bVar.b() != null) {
                                    lineCellView.setClickable(true);
                                    lineCellView.setClickCountListener(new v.i(lineCellView, bVar));
                                }
                                ViewGroup viewGroup4 = qVar.A;
                                if (viewGroup4 != null) {
                                    viewGroup4.addView(lineCellView);
                                    i11 = i12;
                                } else {
                                    kotlin.jvm.internal.u.s("officialAllTimeStats");
                                    throw null;
                                }
                            } else {
                                kotlin.jvm.internal.u.s("officialAllTimeStats");
                                throw null;
                            }
                        } else {
                            kotlin.collections.x.K0();
                            throw null;
                        }
                    }
                    return;
                }
                kotlin.jvm.internal.u.s("officialAllTimeStatsCard");
                throw null;
            }
            kotlin.jvm.internal.u.s("officialAllTimeStats");
            throw null;
        }
        kotlin.jvm.internal.u.s("officialAllTimeStats");
        throw null;
    }

    public static final void O1(q qVar, String str) {
        Button button = qVar.f59434r;
        if (button != null) {
            button.setText(str);
            Button button2 = qVar.f59434r;
            if (button2 != null) {
                button2.setOnClickListener(new sg.j(qVar, 11));
                return;
            } else {
                kotlin.jvm.internal.u.s("userDetailsButton");
                throw null;
            }
        }
        kotlin.jvm.internal.u.s("userDetailsButton");
        throw null;
    }

    public static final void P1(q qVar, User user) {
        Toolbar toolbar = qVar.f59429m;
        if (toolbar != null) {
            toolbar.setTitle(user.l());
            TextView textView = qVar.f59432p;
            if (textView != null) {
                textView.setText(user.l());
                ComposeView composeView = qVar.f59433q;
                if (composeView != null) {
                    String l5 = user.l();
                    kotlin.jvm.internal.u.i(l5, "getFirstName(...)");
                    String s11 = user.s();
                    kotlin.jvm.internal.u.i(s11, "getLastName(...)");
                    com.withings.common.compose.component.c.f(composeView, l5, s11, user.a(), AvatarSize.f33297b, null, null, qVar.f59427k, new s0(qVar), 48);
                    qVar.f59427k = false;
                    return;
                }
                kotlin.jvm.internal.u.s("userPicture");
                throw null;
            }
            kotlin.jvm.internal.u.s("userName");
            throw null;
        }
        kotlin.jvm.internal.u.s("toolbar");
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final User R1() {
        return (User) this.f59425i.getValue(this, S[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0077  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object S1(com.withings.partner.model.Partner r7, qm0.d<? super nm0.y> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.withings.wiscale2.profile.q.c
            if (r0 == 0) goto L13
            r0 = r8
            com.withings.wiscale2.profile.q$c r0 = (com.withings.wiscale2.profile.q.c) r0
            int r1 = r0.f59450d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f59450d = r1
            goto L18
        L13:
            com.withings.wiscale2.profile.q$c r0 = new com.withings.wiscale2.profile.q$c
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f59448b
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
            int r2 = r0.f59450d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            com.withings.wiscale2.profile.q r7 = r0.f59447a
            nm0.l.b(r8)
            goto L94
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L34:
            com.withings.wiscale2.profile.q r7 = r0.f59447a
            nm0.l.b(r8)
            goto L59
        L3a:
            nm0.l.b(r8)
            boolean r8 = r7.L()
            r2 = 0
            if (r8 == 0) goto L7f
            kotlinx.coroutines.CoroutineDispatcher r8 = kotlinx.coroutines.Dispatchers.getIO()
            com.withings.wiscale2.profile.q$d r3 = new com.withings.wiscale2.profile.q$d
            r3.<init>(r7, r6, r2)
            r0.f59447a = r6
            r0.f59450d = r4
            java.lang.Object r8 = kotlinx.coroutines.BuildersKt.withContext(r8, r3, r0)
            if (r8 != r1) goto L58
            return r1
        L58:
            r7 = r6
        L59:
            r4 = r8
            java.lang.String r4 = (java.lang.String) r4
            com.withings.core.webcontent.HMWebActivity$a r0 = com.withings.core.webcontent.HMWebActivity.f35395c
            android.content.Context r1 = r7.requireContext()
            java.lang.String r8 = "requireContext(...)"
            kotlin.jvm.internal.u.i(r1, r8)
            if (r4 == 0) goto L77
            r2 = 0
            r3 = 0
            r5 = 22
            android.content.Intent r8 = com.withings.core.webcontent.HMWebActivity.a.a(r0, r1, r2, r3, r4, r5)
            androidx.activity.result.b<android.content.Intent> r7 = r7.Q
            r7.a(r8)
            goto La6
        L77:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r8 = "url must not be null !"
            r7.<init>(r8)
            throw r7
        L7f:
            kotlinx.coroutines.CoroutineDispatcher r8 = kotlinx.coroutines.Dispatchers.getIO()
            com.withings.wiscale2.profile.q$e r4 = new com.withings.wiscale2.profile.q$e
            r4.<init>(r7, r6, r2)
            r0.f59447a = r6
            r0.f59450d = r3
            java.lang.Object r8 = kotlinx.coroutines.BuildersKt.withContext(r8, r4, r0)
            if (r8 != r1) goto L93
            return r1
        L93:
            r7 = r6
        L94:
            java.lang.String r8 = (java.lang.String) r8
            androidx.activity.result.b<android.content.Intent> r7 = r7.Q
            android.content.Intent r0 = new android.content.Intent
            java.lang.String r1 = "android.intent.action.VIEW"
            android.net.Uri r8 = android.net.Uri.parse(r8)
            r0.<init>(r1, r8)
            r7.a(r0)
        La6:
            nm0.y r7 = nm0.y.f85009a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.wiscale2.profile.q.S1(com.withings.partner.model.Partner, qm0.d):java.lang.Object");
    }

    public static void s1(q this$0) {
        kotlin.jvm.internal.u.j(this$0, "this$0");
        Button button = this$0.f59434r;
        if (button != null) {
            Context context = button.getContext();
            kotlin.jvm.internal.u.i(context, "getContext(...)");
            this$0.f59427k = true;
            EditProfileActivity.a aVar = EditProfileActivity.f61841i;
            long q11 = this$0.R1().q();
            aVar.getClass();
            this$0.startActivity(EditProfileActivity.a.a(context, q11, false));
            return;
        }
        kotlin.jvm.internal.u.s("userDetailsButton");
        throw null;
    }

    public static void t1(q this$0) {
        kotlin.jvm.internal.u.j(this$0, "this$0");
        SettingsActivity.b bVar = SettingsActivity.f59742k;
        Context requireContext = this$0.requireContext();
        kotlin.jvm.internal.u.i(requireContext, "requireContext(...)");
        this$0.startActivityForResult(SettingsActivity.b.a(bVar, requireContext, false, null, 14), 124);
    }

    public static void u1(q this$0) {
        kotlin.jvm.internal.u.j(this$0, "this$0");
        y0 y0Var = this$0.f59424h;
        if (y0Var != null) {
            BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.h1.a(y0Var), Dispatchers.getIO(), null, new a1(y0Var, null), 2, null);
        } else {
            kotlin.jvm.internal.u.s("profileViewModel");
            throw null;
        }
    }

    public static void v1(androidx.appcompat.app.c this_apply, q this$0) {
        kotlin.jvm.internal.u.j(this_apply, "$this_apply");
        kotlin.jvm.internal.u.j(this$0, "this$0");
        Button g11 = this_apply.g(-1);
        if (g11 != null) {
            ConstraintLayout constraintLayout = this$0.f59431o;
            if (constraintLayout != null) {
                Context context = constraintLayout.getContext();
                kotlin.jvm.internal.u.i(context, "getContext(...)");
                g11.setTextColor(ah.u.w(C1987R.attr.colorError, context, -65281));
                return;
            }
            kotlin.jvm.internal.u.s("userContainer");
            throw null;
        }
    }

    public static void w1(q this$0, Reminder reminder) {
        kotlin.jvm.internal.u.j(this$0, "this$0");
        kotlin.jvm.internal.u.j(reminder, "$reminder");
        y0 y0Var = this$0.f59424h;
        if (y0Var != null) {
            ReminderRepository reminderRepository = ReminderModule.INSTANCE.getReminderRepository();
            kotlin.jvm.internal.u.j(reminderRepository, "reminderRepository");
            BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.h1.a(y0Var), Dispatchers.getIO(), null, new z0(reminderRepository, reminder, null), 2, null);
            return;
        }
        kotlin.jvm.internal.u.s("profileViewModel");
        throw null;
    }

    public static final void x1(q qVar, Context context) {
        qVar.f59427k = true;
        EditProfileActivity.a aVar = EditProfileActivity.f61841i;
        long q11 = qVar.R1().q();
        aVar.getClass();
        qVar.startActivity(EditProfileActivity.a.a(context, q11, false));
    }

    @Override // com.withings.wiscale2.profile.ProfileUsersView.a
    public final void J0(Intent intent) {
        startActivityForResult(intent, 122);
    }

    @Override // com.withings.wiscale2.profile.v0.a
    public final void V(Partner partner) {
        BuildersKt__Builders_commonKt.launch$default(m0.t.l(this), null, null, new b(partner, this, null), 3, null);
    }

    @Override // com.withings.wiscale2.profile.ProfileTargetView.a
    public final void a0(Intent intent) {
        startActivityForResult(intent, 121);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i11, int i12, Intent intent) {
        boolean z5;
        super.onActivityResult(i11, i12, intent);
        if (i11 != 34 && i11 != 35) {
            if (i11 == 124) {
                if (i12 == 1002) {
                    requireActivity().recreate();
                    return;
                }
                FragmentActivity activity = getActivity();
                if (activity != null) {
                    activity.setResult(i12);
                    return;
                }
                return;
            }
            return;
        }
        if (i12 == -1) {
            z5 = true;
        } else {
            z5 = false;
        }
        this.f59426j = z5;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setHasOptionsMenu(true);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        kotlin.jvm.internal.u.j(menu, "menu");
        kotlin.jvm.internal.u.j(inflater, "inflater");
        super.onCreateOptionsMenu(menu, inflater);
        inflater.inflate(C1987R.menu.profile, menu);
        View actionView = menu.findItem(C1987R.id.action_settings).getActionView();
        if (actionView != null) {
            actionView.setOnClickListener(new com.google.android.material.search.j(this, 16));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        ProfileTargetView profileTargetView = this.f59436t;
        if (profileTargetView != null) {
            profileTargetView.setDelegate(null);
            ProfileUsersView profileUsersView = this.f59439w;
            if (profileUsersView != null) {
                profileUsersView.setDelegate(null);
                super.onDestroy();
                return;
            }
            kotlin.jvm.internal.u.s("profileUsersView");
            throw null;
        }
        kotlin.jvm.internal.u.s("profileTargetView");
        throw null;
    }

    @Override // com.withings.reminder.profile.ReminderListener
    public final void onDiscoveryClick() {
        RemindersDiscoveryActivity.Companion companion = RemindersDiscoveryActivity.Companion;
        ConstraintLayout constraintLayout = this.f59431o;
        if (constraintLayout != null) {
            Context context = constraintLayout.getContext();
            kotlin.jvm.internal.u.i(context, "getContext(...)");
            startActivityForResult(companion.createIntent(context), 34);
            return;
        }
        kotlin.jvm.internal.u.s("userContainer");
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    public final boolean onOptionsItemSelected(MenuItem item) {
        kotlin.jvm.internal.u.j(item, "item");
        int itemId = item.getItemId();
        if (itemId == 16908332) {
            requireActivity().finish();
            return true;
        } else if (itemId == C1987R.id.action_settings) {
            SettingsActivity.b bVar = SettingsActivity.f59742k;
            Context requireContext = requireContext();
            kotlin.jvm.internal.u.i(requireContext, "requireContext(...)");
            startActivityForResult(SettingsActivity.b.a(bVar, requireContext, false, null, 14), 124);
            return true;
        } else if (itemId != C1987R.id.action_help) {
            return false;
        } else {
            Context requireContext2 = requireContext();
            kotlin.jvm.internal.u.i(requireContext2, "requireContext(...)");
            com.withings.common.device.r.b(requireContext2);
            return true;
        }
    }

    @Override // com.withings.reminder.profile.ReminderListener
    public final void onReminderClicked(Reminder reminder) {
        kotlin.jvm.internal.u.j(reminder, "reminder");
        ReminderDetailsActivity.Companion companion = ReminderDetailsActivity.Companion;
        Context requireContext = requireContext();
        kotlin.jvm.internal.u.i(requireContext, "requireContext(...)");
        startActivityForResult(companion.createIntent(requireContext, reminder), 35);
    }

    @Override // com.withings.reminder.profile.ReminderListener
    public final void onReminderDelete(Reminder reminder) {
        kotlin.jvm.internal.u.j(reminder, "reminder");
        ConstraintLayout constraintLayout = this.f59431o;
        if (constraintLayout != null) {
            qc.b bVar = new qc.b(constraintLayout.getContext());
            bVar.v(getString(C1987R.string._REMINDER_DELETE_CONFIRMATION_));
            final androidx.appcompat.app.c create = bVar.z(C1987R.string._DELETE_YES_, new com.withings.device.setup.ui.c(3, this, reminder)).w(C1987R.string._CANCEL_, new bf0.a(2)).create();
            create.setOnShowListener(new DialogInterface.OnShowListener() { // from class: com.withings.wiscale2.profile.p
                @Override // android.content.DialogInterface.OnShowListener
                public final void onShow(DialogInterface dialogInterface) {
                    q.v1(androidx.appcompat.app.c.this, this);
                }
            });
            create.show();
            this.f59428l = create;
            return;
        }
        kotlin.jvm.internal.u.s("userContainer");
        throw null;
    }

    @Override // com.withings.reminder.profile.ReminderListener
    public final void onReminderSwitched(Reminder reminder, boolean z5) {
        kotlin.jvm.internal.u.j(reminder, "reminder");
        y0 y0Var = this.f59424h;
        if (y0Var != null) {
            BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.h1.a(y0Var), Dispatchers.getIO(), null, new b1(reminder, z5, null), 2, null);
        } else {
            kotlin.jvm.internal.u.s("profileViewModel");
            throw null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        AppCompatActivity appCompatActivity;
        super.onResume();
        v70.a.c("profile", null, 6);
        AppBarLayout appBarLayout = this.f59430n;
        if (appBarLayout != null) {
            NestedScrollView nestedScrollView = this.f59441y;
            if (nestedScrollView != null) {
                Context context = appBarLayout.getContext();
                kotlin.jvm.internal.u.i(context, "getContext(...)");
                Toolbar toolbar = this.f59429m;
                if (toolbar != null) {
                    j80.e.b(nestedScrollView, appBarLayout, new j80.i(context, toolbar), null);
                    FragmentActivity activity = getActivity();
                    if (activity instanceof AppCompatActivity) {
                        appCompatActivity = (AppCompatActivity) activity;
                    } else {
                        appCompatActivity = null;
                    }
                    if (appCompatActivity != null) {
                        Toolbar toolbar2 = this.f59429m;
                        if (toolbar2 != null) {
                            appCompatActivity.setSupportActionBar(toolbar2);
                            ActionBar supportActionBar = appCompatActivity.getSupportActionBar();
                            if (supportActionBar != null) {
                                supportActionBar.p(false);
                                supportActionBar.o(true);
                                supportActionBar.q(true);
                            }
                        } else {
                            kotlin.jvm.internal.u.s("toolbar");
                            throw null;
                        }
                    }
                    RecyclerView recyclerView = this.f59438v;
                    if (recyclerView != null) {
                        recyclerView.w0(0);
                        return;
                    } else {
                        kotlin.jvm.internal.u.s("partnersRecycler");
                        throw null;
                    }
                }
                kotlin.jvm.internal.u.s("toolbar");
                throw null;
            }
            kotlin.jvm.internal.u.s("scrollView");
            throw null;
        }
        kotlin.jvm.internal.u.s("appBarLayout");
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.u.j(view, "view");
        super.onViewCreated(view, bundle);
        kotlin.jvm.internal.u.i(view.findViewById(C1987R.id.root), "findViewById(...)");
        View findViewById = view.findViewById(C1987R.id.toolbar);
        kotlin.jvm.internal.u.i(findViewById, "findViewById(...)");
        this.f59429m = (Toolbar) findViewById;
        View findViewById2 = view.findViewById(C1987R.id.app_bar);
        kotlin.jvm.internal.u.i(findViewById2, "findViewById(...)");
        this.f59430n = (AppBarLayout) findViewById2;
        View findViewById3 = view.findViewById(C1987R.id.section_header);
        kotlin.jvm.internal.u.i(findViewById3, "findViewById(...)");
        this.f59431o = (ConstraintLayout) findViewById3;
        View findViewById4 = view.findViewById(C1987R.id.header_name);
        kotlin.jvm.internal.u.i(findViewById4, "findViewById(...)");
        this.f59432p = (TextView) findViewById4;
        View findViewById5 = view.findViewById(C1987R.id.header_plan_icon);
        kotlin.jvm.internal.u.i(findViewById5, "findViewById(...)");
        this.F = (ImageView) findViewById5;
        View findViewById6 = view.findViewById(C1987R.id.header_picture);
        kotlin.jvm.internal.u.i(findViewById6, "findViewById(...)");
        this.f59433q = (ComposeView) findViewById6;
        View findViewById7 = view.findViewById(C1987R.id.profile_user_details_view);
        kotlin.jvm.internal.u.i(findViewById7, "findViewById(...)");
        this.f59434r = (Button) findViewById7;
        View findViewById8 = view.findViewById(C1987R.id.profile_badge_view_new);
        kotlin.jvm.internal.u.i(findViewById8, "findViewById(...)");
        this.f59435s = (ComposeView) findViewById8;
        View findViewById9 = view.findViewById(C1987R.id.profile_target_view);
        kotlin.jvm.internal.u.i(findViewById9, "findViewById(...)");
        this.f59436t = (ProfileTargetView) findViewById9;
        View findViewById10 = view.findViewById(C1987R.id.recycler_view_profile_partners);
        kotlin.jvm.internal.u.i(findViewById10, "findViewById(...)");
        this.f59438v = (RecyclerView) findViewById10;
        View findViewById11 = view.findViewById(C1987R.id.profile_partner_view);
        kotlin.jvm.internal.u.i(findViewById11, "findViewById(...)");
        this.f59437u = findViewById11;
        View findViewById12 = view.findViewById(C1987R.id.profile_users_view);
        kotlin.jvm.internal.u.i(findViewById12, "findViewById(...)");
        this.f59439w = (ProfileUsersView) findViewById12;
        View findViewById13 = view.findViewById(C1987R.id.profile_reminders_view);
        kotlin.jvm.internal.u.i(findViewById13, "findViewById(...)");
        this.f59440x = (RemindersSectionView) findViewById13;
        View findViewById14 = view.findViewById(C1987R.id.nested_scrollview);
        kotlin.jvm.internal.u.i(findViewById14, "findViewById(...)");
        this.f59441y = (NestedScrollView) findViewById14;
        View findViewById15 = view.findViewById(C1987R.id.all_time_stats_card);
        kotlin.jvm.internal.u.i(findViewById15, "findViewById(...)");
        this.f59442z = findViewById15;
        kotlin.jvm.internal.u.i(view.findViewById(C1987R.id.all_time_stats_card_header), "findViewById(...)");
        View findViewById16 = view.findViewById(C1987R.id.official_all_time_stats);
        kotlin.jvm.internal.u.i(findViewById16, "findViewById(...)");
        this.A = (ViewGroup) findViewById16;
        View findViewById17 = view.findViewById(C1987R.id.profile_medical_report_view);
        kotlin.jvm.internal.u.i(findViewById17, "findViewById(...)");
        this.B = (ProfileMedicalReportView) findViewById17;
        View findViewById18 = view.findViewById(C1987R.id.profile_main_target_view);
        kotlin.jvm.internal.u.i(findViewById18, "findViewById(...)");
        ComposeView composeView = (ComposeView) findViewById18;
        composeView.setContent(new s1.a(true, 915991859, new r0(this, composeView)));
        ComposeView composeView2 = this.f59435s;
        if (composeView2 != null) {
            composeView2.setContent(new s1.a(true, -985650901, new u(this)));
            if (wr.b.c(FeatureFlag.f39129s)) {
                View findViewById19 = view.findViewById(C1987R.id.profile_family_view);
                kotlin.jvm.internal.u.i(findViewById19, "findViewById(...)");
                ((ComposeView) findViewById19).setContent(new s1.a(true, -21145658, new x(this)));
            }
            AppBarLayout appBarLayout = this.f59430n;
            if (appBarLayout != null) {
                ay.b.n(appBarLayout, true, false, 29);
                RecyclerView recyclerView = this.f59438v;
                if (recyclerView != null) {
                    kg0.c cVar = this.P;
                    if (cVar != null) {
                        recyclerView.setAdapter(new v0(this, cVar));
                        ProfileTargetView profileTargetView = this.f59436t;
                        if (profileTargetView != null) {
                            profileTargetView.setDelegate(this);
                            ProfileUsersView profileUsersView = this.f59439w;
                            if (profileUsersView != null) {
                                profileUsersView.setDelegate(this);
                                RemindersSectionView remindersSectionView = this.f59440x;
                                if (remindersSectionView != null) {
                                    remindersSectionView.setListener(this);
                                    ProfileMedicalReportView profileMedicalReportView = this.B;
                                    if (profileMedicalReportView != null) {
                                        profileMedicalReportView.setUser(R1());
                                        y0 y0Var = (y0) new androidx.lifecycle.k1(this, new z(this)).a(y0.class);
                                        xw.d.c(this, y0Var.T0(), new f0(this));
                                        xw.d.c(this, y0Var.B0(), new g0(this));
                                        xw.d.c(this, y0Var.M0(), new h0(this));
                                        xw.d.c(this, y0Var.z0(), new i0(this));
                                        xw.d.c(this, y0Var.O0(), new j0(this));
                                        xw.d.c(this, y0Var.G0(), new k0(this));
                                        xw.d.c(this, y0Var.A0(), new l0(this));
                                        xw.d.c(this, y0Var.r0(), new m0(this));
                                        xw.d.c(this, y0Var.R0(), new n0(this));
                                        xw.d.c(this, y0Var.q0(), new a0(this));
                                        xw.d.c(this, y0Var.y0(), new b0(this));
                                        xw.d.c(this, y0Var.K0(), new c0(this));
                                        xw.d.c(this, y0Var.F0(), new d0(this));
                                        xw.d.c(this, y0Var.U0(), new e0(this));
                                        this.f59424h = y0Var;
                                        return;
                                    }
                                    kotlin.jvm.internal.u.s("profileMedicalReportView");
                                    throw null;
                                }
                                kotlin.jvm.internal.u.s("reminderSectionView");
                                throw null;
                            }
                            kotlin.jvm.internal.u.s("profileUsersView");
                            throw null;
                        }
                        kotlin.jvm.internal.u.s("profileTargetView");
                        throw null;
                    }
                    kotlin.jvm.internal.u.s("hasPartnerWarningAssociationStatusUseCase");
                    throw null;
                }
                kotlin.jvm.internal.u.s("partnersRecycler");
                throw null;
            }
            kotlin.jvm.internal.u.s("appBarLayout");
            throw null;
        }
        kotlin.jvm.internal.u.s("profileBadgeViewNew");
        throw null;
    }
}
