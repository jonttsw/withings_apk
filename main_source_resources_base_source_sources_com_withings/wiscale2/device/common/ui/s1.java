package com.withings.wiscale2.device.common.ui;

import android.annotation.SuppressLint;
import android.content.Context;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.switchmaterial.SwitchMaterial;
import org.joda.time.DateTime;
import tb0.m3;
/* compiled from: MedicalFeatureListAdapter.kt */
/* loaded from: classes5.dex */
public final class s1 extends RecyclerView.z {

    /* renamed from: a  reason: collision with root package name */
    private final Context f54076a;

    /* renamed from: b  reason: collision with root package name */
    private final a f54077b;

    /* renamed from: c  reason: collision with root package name */
    private final m3 f54078c;

    /* compiled from: MedicalFeatureListAdapter.kt */
    /* loaded from: classes5.dex */
    public interface a {
        void b3(int i11, boolean z5);
    }

    public s1(Context context, a aVar, m3 m3Var) {
        super(m3Var.f99343h);
        this.f54076a = context;
        this.f54077b = aVar;
        this.f54078c = m3Var;
    }

    public static void a(s1 this$0, com.withings.wiscale2.device.common.ui.a this_with, boolean z5) {
        kotlin.jvm.internal.u.j(this$0, "this$0");
        kotlin.jvm.internal.u.j(this_with, "$this_with");
        a aVar = this$0.f54077b;
        if (aVar != null) {
            aVar.b3(this_with.c(), z5);
        }
    }

    @SuppressLint({"SetTextI18n"})
    public final void b(final com.withings.wiscale2.device.common.ui.a aVar) {
        String str;
        m3 m3Var = this.f54078c;
        TextView textView = m3Var.f99340e;
        String f11 = aVar.f();
        int c11 = aVar.c();
        textView.setText(f11 + "(" + c11 + ")");
        SwitchMaterial switchMaterial = m3Var.f99342g;
        switchMaterial.setOnCheckedChangeListener(null);
        switchMaterial.setChecked(aVar.a());
        switchMaterial.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.withings.wiscale2.device.common.ui.r1
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z5) {
                s1.a(s1.this, aVar, z5);
            }
        });
        switchMaterial.setEnabled(aVar.h());
        DateTime dateTime = new DateTime(aVar.e() * 1000);
        Context context = this.f54076a;
        m3Var.f99339d.setText(androidx.activity.a0.b("Modified: ", b50.b.h(context, dateTime)));
        m3Var.f99341f.setText(androidx.activity.a0.b("Start date: ", b50.b.h(context, new DateTime(aVar.g()))));
        m3Var.f99336a.setText(androidx.activity.a0.b("End date: ", b50.b.h(context, new DateTime(aVar.b()))));
        Integer d11 = aVar.d();
        m3Var.f99337b.setText("Frequency: " + d11);
        if (aVar.i()) {
            str = "Yes";
        } else {
            str = "No";
        }
        m3Var.f99338c.setText("Is tutorial seen: ".concat(str));
    }
}
