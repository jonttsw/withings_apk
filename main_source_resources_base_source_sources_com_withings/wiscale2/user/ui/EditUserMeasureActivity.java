package com.withings.wiscale2.user.ui;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Spinner;
import android.widget.Toast;
import androidx.activity.ComponentActivity;
import androidx.appcompat.app.ActionBar;
import androidx.lifecycle.k1;
import androidx.lifecycle.l0;
import by.kirich1409.viewbindingdelegate.LifecycleViewBindingProperty;
import com.withings.core.webcontent.HMWebActivity;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.user.User;
import com.withings.views.view.WorkflowBar;
import com.withings.webservices.legacy.common.exception.CreateUserUnauthorizedException;
import com.withings.webservices.legacy.common.exception.WrongStatusException;
import com.withings.wiscale2.C1987R;
import com.withings.wiscale2.user.ui.EditUserMeasureActivity;
import java.util.List;
import java.util.Locale;
import javax.inject.Inject;
import kotlin.Metadata;
import l70.u;
/* compiled from: EditUserMeasureActivity.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/withings/wiscale2/user/ui/EditUserMeasureActivity;", "Lcom/withings/android/activity/WithingsActivity;", "<init>", "()V", "a", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class EditUserMeasureActivity extends Hilt_EditUserMeasureActivity {

    /* renamed from: e  reason: collision with root package name */
    private final f f61792e;

    /* renamed from: f  reason: collision with root package name */
    private final nm0.g f61793f;

    /* renamed from: g  reason: collision with root package name */
    private final nm0.g f61794g;

    /* renamed from: h  reason: collision with root package name */
    private final nm0.g f61795h;

    /* renamed from: i  reason: collision with root package name */
    private final nm0.g f61796i;

    /* renamed from: j  reason: collision with root package name */
    private final by.kirich1409.viewbindingdelegate.f f61797j;
    @Inject

    /* renamed from: k  reason: collision with root package name */
    public x f61798k;

    /* renamed from: l  reason: collision with root package name */
    private final nm0.g f61799l;

    /* renamed from: m  reason: collision with root package name */
    private ProgressDialog f61800m;

    /* renamed from: o  reason: collision with root package name */
    static final /* synthetic */ fn0.k<Object>[] f61791o = {androidx.camera.core.v.c(EditUserMeasureActivity.class, ConstantsWs.SCREEN_DISPLAY_CONTEXT_KEY_USER_SCREENS_SHORT, "getUser()Lcom/withings/user/User;", 0), androidx.camera.core.v.c(EditUserMeasureActivity.class, "binding", "getBinding()Lcom/withings/wiscale2/databinding/ActivityEditUserMeasureBinding;", 0)};

    /* renamed from: n  reason: collision with root package name */
    public static final a f61790n = new Object();

    /* compiled from: EditUserMeasureActivity.kt */
    /* loaded from: classes5.dex */
    public static final class a {
    }

    /* compiled from: EditUserMeasureActivity.kt */
    /* loaded from: classes5.dex */
    static final class b extends kotlin.jvm.internal.w implements ym0.a<List<? extends l70.u>> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f61801a = new kotlin.jvm.internal.w(0);

        @Override // ym0.a
        public final List<? extends l70.u> invoke() {
            l70.u.f78815b.getClass();
            return u.a.g();
        }
    }

    /* compiled from: EditUserMeasureActivity.kt */
    /* loaded from: classes5.dex */
    static final class c extends kotlin.jvm.internal.w implements ym0.a<Boolean> {
        c() {
            super(0);
        }

        @Override // ym0.a
        public final Boolean invoke() {
            return Boolean.valueOf(EditUserMeasureActivity.this.getIntent().getBooleanExtra("EXTRA_IS_CREATING_MAIN_USER", false));
        }
    }

    /* compiled from: EditUserMeasureActivity.kt */
    /* loaded from: classes5.dex */
    static final class d extends kotlin.jvm.internal.w implements ym0.a<String> {
        d() {
            super(0);
        }

        @Override // ym0.a
        public final String invoke() {
            String stringExtra = EditUserMeasureActivity.this.getIntent().getStringExtra("extra_entry_location");
            if (stringExtra == null) {
                return "";
            }
            return stringExtra;
        }
    }

    /* compiled from: EditUserMeasureActivity.kt */
    /* loaded from: classes5.dex */
    static final class e implements l0, kotlin.jvm.internal.p {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ ym0.l f61804a;

        e(ym0.l lVar) {
            this.f61804a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof l0) || !(obj instanceof kotlin.jvm.internal.p)) {
                return false;
            }
            return kotlin.jvm.internal.u.e(this.f61804a, ((kotlin.jvm.internal.p) obj).getFunctionDelegate());
        }

        @Override // kotlin.jvm.internal.p
        public final nm0.d<?> getFunctionDelegate() {
            return this.f61804a;
        }

        public final int hashCode() {
            return this.f61804a.hashCode();
        }

        @Override // androidx.lifecycle.l0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f61804a.invoke(obj);
        }
    }

    /* compiled from: Activity.kt */
    /* loaded from: classes5.dex */
    public static final class f implements bn0.d<Activity, User> {

        /* renamed from: a  reason: collision with root package name */
        private final nm0.g f61805a = nm0.h.b(new s(this));

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Activity f61806b;

        public f(Activity activity) {
            this.f61806b = activity;
        }

        /* JADX WARN: Type inference failed for: r2v4, types: [com.withings.user.User, java.lang.Object] */
        @Override // bn0.d
        public final User getValue(Activity activity, fn0.k property) {
            Activity thisRef = activity;
            kotlin.jvm.internal.u.j(thisRef, "thisRef");
            kotlin.jvm.internal.u.j(property, "property");
            return this.f61805a.getValue();
        }
    }

    /* compiled from: ActivityViewBindings.kt */
    /* loaded from: classes5.dex */
    public static final class g extends kotlin.jvm.internal.w implements ym0.l<ComponentActivity, tb0.l> {
        @Override // ym0.l
        public final tb0.l invoke(ComponentActivity componentActivity) {
            ComponentActivity activity = componentActivity;
            kotlin.jvm.internal.u.j(activity, "activity");
            View e11 = androidx.core.app.a.e(activity, C1987R.id.container);
            kotlin.jvm.internal.u.i(e11, "requireViewById(this, id)");
            return tb0.l.a(e11);
        }
    }

    /* compiled from: EditUserMeasureActivity.kt */
    /* loaded from: classes5.dex */
    static final class h extends kotlin.jvm.internal.w implements ym0.a<w> {
        h() {
            super(0);
        }

        @Override // ym0.a
        public final w invoke() {
            EditUserMeasureActivity editUserMeasureActivity = EditUserMeasureActivity.this;
            return (w) new k1(editUserMeasureActivity, new t(editUserMeasureActivity)).a(w.class);
        }
    }

    /* compiled from: EditUserMeasureActivity.kt */
    /* loaded from: classes5.dex */
    static final class i extends kotlin.jvm.internal.w implements ym0.a<List<? extends l70.u>> {

        /* renamed from: a  reason: collision with root package name */
        public static final i f61808a = new kotlin.jvm.internal.w(0);

        @Override // ym0.a
        public final List<? extends l70.u> invoke() {
            if (kotlin.jvm.internal.u.e(Locale.JAPAN, Locale.getDefault())) {
                return kotlin.collections.x.V(new l70.u(1));
            }
            l70.u.f78815b.getClass();
            return u.a.h();
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [ym0.l, kotlin.jvm.internal.w] */
    public EditUserMeasureActivity() {
        super(0);
        this.f61792e = new f(this);
        this.f61793f = nm0.h.b(new c());
        this.f61794g = nm0.h.b(new d());
        this.f61795h = nm0.h.b(b.f61801a);
        this.f61796i = nm0.h.b(i.f61808a);
        this.f61797j = by.kirich1409.viewbindingdelegate.b.a(this, u9.a.a(), new kotlin.jvm.internal.w(1));
        this.f61799l = nm0.h.b(new h());
    }

    public static final User B3(EditUserMeasureActivity editUserMeasureActivity) {
        return (User) editUserMeasureActivity.f61792e.getValue(editUserMeasureActivity, f61791o[0]);
    }

    public static final w C3(EditUserMeasureActivity editUserMeasureActivity) {
        return (w) editUserMeasureActivity.f61799l.getValue();
    }

    public static final void D3(EditUserMeasureActivity editUserMeasureActivity) {
        ProgressDialog progressDialog = editUserMeasureActivity.f61800m;
        if (progressDialog != null) {
            progressDialog.dismiss();
        }
        editUserMeasureActivity.f61800m = null;
    }

    public static final boolean E3(EditUserMeasureActivity editUserMeasureActivity) {
        return ((Boolean) editUserMeasureActivity.f61793f.getValue()).booleanValue();
    }

    public static final void F3(EditUserMeasureActivity editUserMeasureActivity, l70.u uVar) {
        tb0.l K3 = editUserMeasureActivity.K3();
        K3.f99291a.setSelection(editUserMeasureActivity.L3().indexOf(uVar));
        editUserMeasureActivity.K3().f99293c.j(uVar.j());
    }

    public static final void G3(final EditUserMeasureActivity editUserMeasureActivity, Exception exc) {
        int i11;
        editUserMeasureActivity.getClass();
        if (exc instanceof WrongStatusException.Checked) {
            i11 = ((WrongStatusException.Checked) exc).getStatus();
        } else if (exc instanceof WrongStatusException.Runtime) {
            i11 = ((WrongStatusException.Runtime) exc).getStatus();
        } else {
            i11 = -1;
        }
        eh.a.a(!((Boolean) editUserMeasureActivity.f61793f.getValue()).booleanValue(), (String) editUserMeasureActivity.f61794g.getValue(), Integer.valueOf(i11));
        if (exc instanceof CreateUserUnauthorizedException) {
            qc.b z5 = new qc.b(editUserMeasureActivity).w(C1987R.string._CANCEL_, new DialogInterface.OnClickListener() { // from class: com.withings.wiscale2.user.ui.h
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i12) {
                    EditUserMeasureActivity.a aVar = EditUserMeasureActivity.f61790n;
                    EditUserMeasureActivity this$0 = EditUserMeasureActivity.this;
                    kotlin.jvm.internal.u.j(this$0, "this$0");
                    this$0.finish();
                }
            }).z(C1987R.string._HELP_, new DialogInterface.OnClickListener() { // from class: com.withings.wiscale2.user.ui.i
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i12) {
                    EditUserMeasureActivity.a aVar = EditUserMeasureActivity.f61790n;
                    EditUserMeasureActivity this$0 = EditUserMeasureActivity.this;
                    kotlin.jvm.internal.u.j(this$0, "this$0");
                    HMWebActivity.a aVar2 = HMWebActivity.f35395c;
                    String string = this$0.getString(C1987R.string.partner_assignation_monoUserAccount_url);
                    kotlin.jvm.internal.u.i(string, "getString(...)");
                    this$0.startActivity(aVar2.c(this$0, "", string));
                }
            });
            z5.C(C1987R.string.partner_assignation_monoUserAccount_title);
            z5.g(C1987R.string.partner_assignation_monoUserAccount_description);
            z5.s();
            return;
        }
        Toast.makeText(editUserMeasureActivity, editUserMeasureActivity.getString(C1987R.string._ERROR_CONNECTION_TIMEOUT_), 0).show();
    }

    public static final void H3(EditUserMeasureActivity editUserMeasureActivity, User user) {
        eh.a.b(!((Boolean) editUserMeasureActivity.f61793f.getValue()).booleanValue(), (String) editUserMeasureActivity.f61794g.getValue());
        if (!((Boolean) editUserMeasureActivity.f61793f.getValue()).booleanValue()) {
            kotlin.jvm.internal.u.j(user, "user");
            Intent putExtra = new Intent(editUserMeasureActivity, EditUserEmailActivity.class).putExtra("extra_user", user);
            kotlin.jvm.internal.u.i(putExtra, "putExtra(...)");
            editUserMeasureActivity.startActivity(putExtra);
        }
        editUserMeasureActivity.setResult(-1);
        editUserMeasureActivity.finish();
    }

    public static final void I3(EditUserMeasureActivity editUserMeasureActivity, l70.u uVar) {
        tb0.l K3 = editUserMeasureActivity.K3();
        K3.f99292b.setSelection(editUserMeasureActivity.M3().indexOf(uVar));
        editUserMeasureActivity.K3().f99295e.i(uVar.j());
    }

    public static final void J3(EditUserMeasureActivity editUserMeasureActivity) {
        if (editUserMeasureActivity.f61800m == null) {
            ProgressDialog progressDialog = new ProgressDialog(editUserMeasureActivity);
            progressDialog.setMessage(editUserMeasureActivity.getString(C1987R.string._LOADING_));
            progressDialog.setIndeterminate(true);
            progressDialog.setCancelable(true);
            progressDialog.show();
            editUserMeasureActivity.f61800m = progressDialog;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final tb0.l K3() {
        Object value = ((LifecycleViewBindingProperty) this.f61797j).getValue(this, f61791o[1]);
        kotlin.jvm.internal.u.i(value, "getValue(...)");
        return (tb0.l) value;
    }

    private final List<l70.u> L3() {
        return (List) this.f61795h.getValue();
    }

    private final List<l70.u> M3() {
        return (List) this.f61796i.getValue();
    }

    public static void z3(EditUserMeasureActivity this$0) {
        kotlin.jvm.internal.u.j(this$0, "this$0");
        ((w) this$0.f61799l.getValue()).O0(Double.valueOf(this$0.K3().f99293c.getValue().f95794y), Double.valueOf(this$0.K3().f99295e.getValue().f95794y));
    }

    @Override // com.withings.wiscale2.user.ui.Hilt_EditUserMeasureActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setSupportActionBar(K3().f99294d);
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.o(true);
        }
        tb0.l K3 = K3();
        gi.f fVar = new gi.f(this, 18);
        WorkflowBar workflowBar = K3.f99296f;
        workflowBar.setLeftClickListener(fVar);
        workflowBar.setRightClickListener(new androidx.viewpager.widget.c(this, 16));
        Spinner editUserMeasureHeightUnit = K3().f99291a;
        kotlin.jvm.internal.u.i(editUserMeasureHeightUnit, "editUserMeasureHeightUnit");
        com.withings.views.view.l.a(editUserMeasureHeightUnit, L3(), new q(this));
        K3().f99293c.requestFocus();
        Spinner editUserMeasureWeightUnit = K3().f99292b;
        kotlin.jvm.internal.u.i(editUserMeasureWeightUnit, "editUserMeasureWeightUnit");
        com.withings.views.view.l.a(editUserMeasureWeightUnit, M3(), new r(this));
        w wVar = (w) this.f61799l.getValue();
        wVar.z0().observe(this, new e(new j(this)));
        wVar.G0().observe(this, new e(new k(this)));
        wVar.y0().observe(this, new e(new l(this)));
        wVar.F0().observe(this, new e(new m(this)));
        wVar.B0().observe(this, new e(new n(this)));
        wVar.t0().observe(this, new e(new o(this)));
        wVar.A0().observe(this, new e(new p(this)));
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem item) {
        kotlin.jvm.internal.u.j(item, "item");
        if (item.getItemId() == 16908332) {
            finish();
            return true;
        }
        return false;
    }
}
