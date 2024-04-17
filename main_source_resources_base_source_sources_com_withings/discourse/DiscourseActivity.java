package com.withings.discourse;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.c;
import androidx.lifecycle.k1;
import com.withings.discourse.DiscourseActivity;
import iq.f;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
/* compiled from: DiscourseActivity.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/withings/discourse/DiscourseActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "discourse_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class DiscourseActivity extends AppCompatActivity {

    /* renamed from: c  reason: collision with root package name */
    public static final /* synthetic */ int f37969c = 0;

    /* renamed from: a  reason: collision with root package name */
    private androidx.appcompat.app.c f37970a;

    /* renamed from: b  reason: collision with root package name */
    private f f37971b;

    public static void A3(DiscourseActivity this$0, int i11) {
        u.j(this$0, "this$0");
        f fVar = this$0.f37971b;
        if (fVar != null) {
            fVar.r0(i11);
        } else {
            u.s("viewModel");
            throw null;
        }
    }

    public static void B3(DiscourseActivity this$0) {
        u.j(this$0, "this$0");
        f fVar = this$0.f37971b;
        if (fVar != null) {
            fVar.y0(this$0);
        } else {
            u.s("viewModel");
            throw null;
        }
    }

    public static final void C3(final DiscourseActivity discourseActivity, DiscourseOption[] discourseOptionArr) {
        androidx.appcompat.app.c cVar = discourseActivity.f37970a;
        if (cVar != null) {
            cVar.dismiss();
        }
        ArrayList arrayList = new ArrayList(discourseOptionArr.length);
        for (DiscourseOption discourseOption : discourseOptionArr) {
            arrayList.add(discourseOption.b());
        }
        androidx.appcompat.app.c create = new c.a(discourseActivity).setTitle("Do you want to make a Discourse?").e((String[]) arrayList.toArray(new String[0]), new cq.b(discourseActivity, 1)).setNegativeButton(17039360, new iq.c(discourseActivity, 0)).create();
        discourseActivity.f37970a = create;
        if (create != null) {
            create.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: iq.d
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    DiscourseActivity.z3(DiscourseActivity.this);
                }
            });
        }
        androidx.appcompat.app.c cVar2 = discourseActivity.f37970a;
        if (cVar2 != null) {
            cVar2.show();
        }
    }

    public static final void D3(DiscourseActivity discourseActivity, String str) {
        discourseActivity.getClass();
        if (!androidx.core.app.a.h(discourseActivity, str)) {
            androidx.appcompat.app.c cVar = discourseActivity.f37970a;
            if (cVar != null) {
                cVar.dismiss();
            }
            androidx.appcompat.app.c create = new c.a(discourseActivity).setTitle("Missing permission").f("You didn't allow Withings to use this feature.\nPlease go to app settings to grant the related permission").m("Settings", new ao.c(discourseActivity, 1)).k(new com.withings.device.details.wsd.programs.e(discourseActivity, 1)).create();
            discourseActivity.f37970a = create;
            if (create != null) {
                create.show();
                return;
            }
            return;
        }
        f fVar = discourseActivity.f37971b;
        if (fVar != null) {
            fVar.A0(str);
        } else {
            u.s("viewModel");
            throw null;
        }
    }

    public static void z3(DiscourseActivity this$0) {
        u.j(this$0, "this$0");
        f fVar = this$0.f37971b;
        if (fVar != null) {
            fVar.t0();
        } else {
            u.s("viewModel");
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i11, int i12, Intent intent) {
        super.onActivityResult(i11, i12, intent);
        f fVar = this.f37971b;
        if (fVar != null) {
            fVar.m0(i11, i12, intent);
        } else {
            u.s("viewModel");
            throw null;
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        androidx.appcompat.app.c cVar = this.f37970a;
        if (cVar != null) {
            cVar.dismiss();
        }
        finish();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        f fVar = (f) new k1(getViewModelStore(), new iq.e(this)).a(f.class);
        yq.a.a(this, fVar.g0(), new a(this));
        yq.a.a(this, fVar.k0(), new b(this));
        yq.a.a(this, fVar.f0(), new c(this));
        yq.a.a(this, fVar.i0(), new d(this));
        yq.a.a(this, fVar.j0(), new e(this));
        this.f37971b = fVar;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onRequestPermissionsResult(int i11, String[] permissions, int[] grantResults) {
        u.j(permissions, "permissions");
        u.j(grantResults, "grantResults");
        super.onRequestPermissionsResult(i11, permissions, grantResults);
        f fVar = this.f37971b;
        if (fVar != null) {
            fVar.p0(i11, permissions, grantResults);
        } else {
            u.s("viewModel");
            throw null;
        }
    }
}
