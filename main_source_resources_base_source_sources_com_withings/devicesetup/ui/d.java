package com.withings.devicesetup.ui;

import android.content.Context;
import android.os.Bundle;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.withings.devicesetup.Setup;
import com.withings.views.view.WorkflowBar;
import com.withings.wiscale2.C1987R;
/* compiled from: SetupBatteryLowFragment.java */
/* loaded from: classes3.dex */
public class d extends Fragment {

    /* renamed from: c  reason: collision with root package name */
    private Setup.WithBatteryCheck f37899c;

    /* renamed from: d  reason: collision with root package name */
    private TextView f37900d;

    /* renamed from: e  reason: collision with root package name */
    private ImageView f37901e;

    /* renamed from: f  reason: collision with root package name */
    private TextView f37902f;

    /* renamed from: g  reason: collision with root package name */
    private TextView f37903g;

    /* renamed from: h  reason: collision with root package name */
    private WorkflowBar f37904h;

    /* renamed from: i  reason: collision with root package name */
    private a f37905i;

    /* compiled from: SetupBatteryLowFragment.java */
    /* loaded from: classes3.dex */
    public interface a {
        void Q();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        this.f37905i = (a) context;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f37899c = (Setup.WithBatteryCheck) getArguments().getParcelable("setup");
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return getActivity().getLayoutInflater().inflate(C1987R.layout.fragment_setup_old, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f37900d = (TextView) view.findViewById(C1987R.id.setup_title);
        this.f37902f = (TextView) view.findViewById(C1987R.id.setup_message);
        this.f37901e = (ImageView) view.findViewById(C1987R.id.setup_image);
        this.f37903g = (TextView) view.findViewById(C1987R.id.setup_error);
        WorkflowBar workflowBar = (WorkflowBar) view.findViewById(C1987R.id.workflowBar);
        this.f37904h = workflowBar;
        workflowBar.setLeftText(C1987R.string._CANCEL_);
        this.f37904h.setLeftClickListener(new b(this));
        this.f37900d.setVisibility(0);
        this.f37901e.setVisibility(0);
        this.f37903g.setVisibility(0);
        this.f37902f.setVisibility(0);
        this.f37903g.setOnClickListener(new c(this));
        this.f37903g.setTextColor(androidx.core.content.a.getColor(getContext(), C1987R.color.bad));
        this.f37900d.setText(getString(this.f37899c.v2()));
        this.f37902f.setText(Html.fromHtml(getString(this.f37899c.G0())));
        this.f37901e.setImageResource(this.f37899c.y1().intValue());
        this.f37903g.setText(getString(this.f37899c.h2()));
    }
}
