package com.withings.medicalreport.ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.l1;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.google.android.material.button.MaterialButton;
import com.withings.core.utils.WithingsFileProvider;
import com.withings.medicalreport.ui.DateSelectionFragment;
import com.withings.medicalreport.ui.PdfPreviewFragment;
import com.withings.medicalreport.ui.RecipientListFragment;
import com.withings.wiscale2.C1987R;
import java.io.File;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.j0;
import org.joda.time.DateTime;
/* compiled from: MedicalReportActivity.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001\u0007B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/withings/medicalreport/ui/MedicalReportActivity;", "Lcom/withings/android/activity/WithingsActivity;", "Lcom/withings/medicalreport/ui/RecipientListFragment$a;", "Lcom/withings/medicalreport/ui/DateSelectionFragment$a;", "Lcom/withings/medicalreport/ui/PdfPreviewFragment$a;", "<init>", "()V", "a", "medicalreport_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class MedicalReportActivity extends Hilt_MedicalReportActivity implements RecipientListFragment.a, DateSelectionFragment.a, PdfPreviewFragment.a {

    /* renamed from: e  reason: collision with root package name */
    private final nm0.g f42174e;

    /* renamed from: f  reason: collision with root package name */
    private final nm0.g f42175f;

    /* renamed from: g  reason: collision with root package name */
    private final f f42176g;

    /* renamed from: h  reason: collision with root package name */
    private final g f42177h;

    /* renamed from: i  reason: collision with root package name */
    private final androidx.constraintlayout.widget.b f42178i;

    /* renamed from: j  reason: collision with root package name */
    private final androidx.constraintlayout.widget.b f42179j;

    /* renamed from: k  reason: collision with root package name */
    private final nm0.g f42180k;

    /* renamed from: l  reason: collision with root package name */
    private final nm0.g f42181l;

    /* renamed from: m  reason: collision with root package name */
    private String f42182m;

    /* renamed from: n  reason: collision with root package name */
    private DateTime f42183n;

    /* renamed from: o  reason: collision with root package name */
    private DateTime f42184o;

    /* renamed from: q  reason: collision with root package name */
    static final /* synthetic */ fn0.k<Object>[] f42173q = {androidx.camera.core.v.c(MedicalReportActivity.class, "userFirstName", "getUserFirstName()Ljava/lang/String;", 0), androidx.camera.core.v.c(MedicalReportActivity.class, "userLastName", "getUserLastName()Ljava/lang/String;", 0)};

    /* renamed from: p  reason: collision with root package name */
    public static final a f42172p = new Object();

    /* compiled from: MedicalReportActivity.kt */
    /* loaded from: classes4.dex */
    public static final class a {
        public static Intent a(Context context, String userFirstName, String userLastName) {
            kotlin.jvm.internal.u.j(context, "context");
            kotlin.jvm.internal.u.j(userFirstName, "userFirstName");
            kotlin.jvm.internal.u.j(userLastName, "userLastName");
            Intent putExtra = new Intent(context, MedicalReportActivity.class).putExtra("EXTRA_FIRSTNAME", userFirstName).putExtra("EXTRA_LASTNAME", userLastName);
            kotlin.jvm.internal.u.i(putExtra, "putExtra(...)");
            return putExtra;
        }
    }

    /* compiled from: MedicalReportActivity.kt */
    /* loaded from: classes4.dex */
    static final class b extends kotlin.jvm.internal.w implements ym0.a<androidx.navigation.e> {
        b() {
            super(0);
        }

        @Override // ym0.a
        public final androidx.navigation.e invoke() {
            return b50.b.d(MedicalReportActivity.this, C1987R.id.nav_host_fragment);
        }
    }

    /* compiled from: MedicalReportActivity.kt */
    /* loaded from: classes4.dex */
    static final class c extends kotlin.jvm.internal.w implements ym0.a<Fragment> {
        c() {
            super(0);
        }

        @Override // ym0.a
        public final Fragment invoke() {
            return MedicalReportActivity.this.getSupportFragmentManager().Y("nav_host_fragment");
        }
    }

    /* compiled from: MedicalReportActivity.kt */
    /* loaded from: classes4.dex */
    static final class d extends kotlin.jvm.internal.w implements ym0.a<MaterialButton> {
        d() {
            super(0);
        }

        @Override // ym0.a
        public final MaterialButton invoke() {
            return (MaterialButton) MedicalReportActivity.this.findViewById(C1987R.id.next_button);
        }
    }

    /* compiled from: MedicalReportActivity.kt */
    /* loaded from: classes4.dex */
    static final class e extends kotlin.jvm.internal.w implements ym0.a<ConstraintLayout> {
        e() {
            super(0);
        }

        @Override // ym0.a
        public final ConstraintLayout invoke() {
            return (ConstraintLayout) MedicalReportActivity.this.findViewById(C1987R.id.root);
        }
    }

    /* compiled from: Activity.kt */
    /* loaded from: classes4.dex */
    public static final class f implements bn0.d<Activity, String> {

        /* renamed from: a  reason: collision with root package name */
        private final nm0.g f42189a = nm0.h.b(new r(this));

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Activity f42190b;

        public f(Activity activity) {
            this.f42190b = activity;
        }

        /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, java.lang.String] */
        @Override // bn0.d
        public final String getValue(Activity activity, fn0.k property) {
            Activity thisRef = activity;
            kotlin.jvm.internal.u.j(thisRef, "thisRef");
            kotlin.jvm.internal.u.j(property, "property");
            return this.f42189a.getValue();
        }
    }

    /* compiled from: Activity.kt */
    /* loaded from: classes4.dex */
    public static final class g implements bn0.d<Activity, String> {

        /* renamed from: a  reason: collision with root package name */
        private final nm0.g f42191a = nm0.h.b(new s(this));

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Activity f42192b;

        public g(Activity activity) {
            this.f42192b = activity;
        }

        /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, java.lang.String] */
        @Override // bn0.d
        public final String getValue(Activity activity, fn0.k property) {
            Activity thisRef = activity;
            kotlin.jvm.internal.u.j(thisRef, "thisRef");
            kotlin.jvm.internal.u.j(property, "property");
            return this.f42191a.getValue();
        }
    }

    public MedicalReportActivity() {
        super(0);
        this.f42174e = nm0.h.b(new e());
        this.f42175f = nm0.h.b(new d());
        this.f42176g = new f(this);
        this.f42177h = new g(this);
        this.f42178i = new androidx.constraintlayout.widget.b();
        this.f42179j = new androidx.constraintlayout.widget.b();
        this.f42180k = nm0.h.b(new b());
        this.f42181l = nm0.h.b(new c());
    }

    public static void A3(MedicalReportActivity this$0, Fragment it) {
        int i11;
        kotlin.jvm.internal.u.j(this$0, "this$0");
        kotlin.jvm.internal.u.j(it, "$it");
        nm0.g gVar = this$0.f42174e;
        androidx.transition.w.a((ConstraintLayout) gVar.getValue(), null);
        List<Fragment> f02 = it.getChildFragmentManager().f0();
        kotlin.jvm.internal.u.i(f02, "getFragments(...)");
        Fragment fragment = (Fragment) kotlin.collections.x.K(f02);
        boolean z5 = fragment instanceof PdfPreviewFragment;
        if (z5) {
            v70.a.c("view_pdf_report", null, 6);
        }
        MaterialButton B3 = this$0.B3();
        if (z5) {
            i11 = C1987R.string._SHARE_;
        } else {
            i11 = C1987R.string._NEXT_;
        }
        B3.setText(this$0.getString(i11));
        if (fragment instanceof RecipientTypeFragment) {
            this$0.f42178i.e((ConstraintLayout) gVar.getValue());
            return;
        }
        this$0.f42179j.e((ConstraintLayout) gVar.getValue());
    }

    private final MaterialButton B3() {
        return (MaterialButton) this.f42175f.getValue();
    }

    public static void z3(MedicalReportActivity this$0) {
        Fragment fragment;
        Map map;
        Map map2;
        FragmentManager childFragmentManager;
        List<Fragment> f02;
        kotlin.jvm.internal.u.j(this$0, "this$0");
        Fragment fragment2 = (Fragment) this$0.f42181l.getValue();
        if (fragment2 != null && (childFragmentManager = fragment2.getChildFragmentManager()) != null && (f02 = childFragmentManager.f0()) != null) {
            fragment = (Fragment) kotlin.collections.x.K(f02);
        } else {
            fragment = null;
        }
        if (fragment instanceof PdfPreviewFragment) {
            int i11 = v70.a.f103433b;
            map2 = j0.f76190a;
            v70.a.d("share_pdf_report", "share_pdf_report", map2, true);
            File file = new File(this$0.getCacheDir(), "medical-reports");
            if (file.mkdirs() || (file.exists() && file.isDirectory())) {
                File file2 = new File(file, "medical_report.pdf");
                androidx.core.app.f0 f0Var = new androidx.core.app.f0(this$0);
                f0Var.j("application/pdf");
                int i12 = WithingsFileProvider.f35394f;
                f0Var.a(WithingsFileProvider.a.a(this$0, file2));
                String string = this$0.getString(C1987R.string.profile_medicalReport_mailSharing_subject);
                kotlin.jvm.internal.u.i(string, "getString(...)");
                fn0.k<Object>[] kVarArr = f42173q;
                f0Var.h(String.format(string, Arrays.copyOf(new Object[]{(String) this$0.f42176g.getValue(this$0, kVarArr[0]), (String) this$0.f42177h.getValue(this$0, kVarArr[1])}, 2)));
                f0Var.i(this$0.getString(C1987R.string.profile_medicalReport_mailSharing_body));
                f0Var.k();
                return;
            }
            return;
        }
        boolean z5 = fragment instanceof RecipientListFragment;
        nm0.g gVar = this$0.f42180k;
        if (z5) {
            this$0.B3().setEnabled(false);
            ((androidx.navigation.e) gVar.getValue()).K(new r8.a(C1987R.id.action_recipientListFragment_to_dateSelectionFragment));
        } else if (fragment instanceof DateSelectionFragment) {
            this$0.B3().setEnabled(false);
            String str = this$0.f42182m;
            DateTime dateTime = this$0.f42183n;
            if (dateTime != null) {
                DateTime dateTime2 = this$0.f42184o;
                if (dateTime2 != null) {
                    ((androidx.navigation.e) gVar.getValue()).K(new n(str, dateTime, dateTime2));
                    int i13 = v70.a.f103433b;
                    map = j0.f76190a;
                    v70.a.d("generate_pdf_report", "generate_pdf_report", map, true);
                    return;
                }
                kotlin.jvm.internal.u.s("endDate");
                throw null;
            }
            kotlin.jvm.internal.u.s("startDate");
            throw null;
        }
    }

    @Override // com.withings.medicalreport.ui.PdfPreviewFragment.a
    public final void B0() {
        B3().setEnabled(false);
    }

    @Override // com.withings.medicalreport.ui.RecipientListFragment.a
    public final void L2(String contactKey) {
        kotlin.jvm.internal.u.j(contactKey, "contactKey");
        B3().setEnabled(true);
        this.f42182m = contactKey;
    }

    @Override // com.withings.medicalreport.ui.PdfPreviewFragment.a
    public final void e0() {
        B3().setEnabled(true);
    }

    @Override // com.withings.medicalreport.ui.Hilt_MedicalReportActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        l1.a(getWindow(), false);
        Toolbar toolbar = (Toolbar) findViewById(C1987R.id.toolbar);
        kotlin.jvm.internal.u.g(toolbar);
        ay.b.n(toolbar, true, false, 29);
        setSupportActionBar(toolbar);
        nm0.g gVar = this.f42174e;
        androidx.constraintlayout.widget.b bVar = this.f42178i;
        bVar.k((ConstraintLayout) gVar.getValue());
        androidx.constraintlayout.widget.b bVar2 = this.f42179j;
        bVar2.l(bVar);
        bVar2.j(C1987R.id.next_button_container, 3);
        bVar2.n(C1987R.id.next_button_container, 4, 0, 4);
        final Fragment fragment = (Fragment) this.f42181l.getValue();
        if (fragment != null) {
            bVar2.e((ConstraintLayout) gVar.getValue());
            fragment.getChildFragmentManager().h(new FragmentManager.l() { // from class: com.withings.medicalreport.ui.q
                @Override // androidx.fragment.app.FragmentManager.l
                public final void c() {
                    MedicalReportActivity.A3(MedicalReportActivity.this, fragment);
                }
            });
        }
        View findViewById = findViewById(C1987R.id.next_button_container);
        kotlin.jvm.internal.u.i(findViewById, "findViewById(...)");
        ay.b.n(findViewById, false, true, 23);
        B3().setOnClickListener(new com.withings.alarm.ui.f(this, 4));
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem item) {
        kotlin.jvm.internal.u.j(item, "item");
        finish();
        return super.onOptionsItemSelected(item);
    }

    @Override // com.withings.medicalreport.ui.DateSelectionFragment.a
    public final void r(DateTime dateTime, DateTime dateTime2) {
        boolean z5;
        MaterialButton B3 = B3();
        if (dateTime != null && dateTime2 != null) {
            z5 = true;
        } else {
            z5 = false;
        }
        B3.setEnabled(z5);
        if (dateTime != null) {
            this.f42183n = dateTime;
        }
        if (dateTime2 != null) {
            this.f42184o = dateTime2;
        }
    }
}
