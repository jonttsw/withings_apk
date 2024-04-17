package com.withings.wiscale2.device.common.setup;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.Fragment;
import com.withings.common.compose.component.AvatarSize;
import com.withings.common.compose.component.c;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.user.User;
import com.withings.views.view.WorkflowBar;
import com.withings.wiscale2.C1987R;
import kotlin.jvm.internal.u;
import m70.i;
import uc0.d;
/* compiled from: PickUserForSetupFragment.java */
/* loaded from: classes5.dex */
public class a extends Fragment {

    /* renamed from: c */
    private LinearLayout f53516c;

    /* renamed from: d */
    private InterfaceC0717a f53517d;

    /* compiled from: PickUserForSetupFragment.java */
    /* renamed from: com.withings.wiscale2.device.common.setup.a$a */
    /* loaded from: classes5.dex */
    public interface InterfaceC0717a {
        void G();

        void P2(User user);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        this.f53517d = (InterfaceC0717a) getActivity();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return getActivity().getLayoutInflater().inflate(C1987R.layout.fragment_setup_pick_user, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        if (this.f53516c.getChildCount() > 0) {
            LinearLayout linearLayout = this.f53516c;
            linearLayout.removeViews(0, linearLayout.getChildCount());
        }
        for (User user : i.b().c()) {
            if (!user.D()) {
                View inflate = getActivity().getLayoutInflater().inflate(C1987R.layout.view_link_user, (ViewGroup) null);
                ComposeView composeView = (ComposeView) inflate.findViewById(C1987R.id.avatar);
                String l5 = user.l();
                String s11 = user.s();
                ((TextView) inflate.findViewById(C1987R.id.username)).setText((l5 + " " + s11).trim());
                String firstname = user.l();
                String lastname = user.s();
                String a11 = user.a();
                AvatarSize avatarSize = AvatarSize.f33299d;
                u.j(composeView, "<this>");
                u.j(firstname, "firstname");
                u.j(lastname, "lastname");
                c.f(composeView, firstname, lastname, a11, avatarSize, null, null, false, null, ConstantsWs.WS_STATUS_WRONGTZNAME);
                this.f53516c.addView(inflate, new FrameLayout.LayoutParams(-1, -2));
                inflate.setOnClickListener(new d(0, this, user));
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f53516c = (LinearLayout) view.findViewById(C1987R.id.userList);
        ((WorkflowBar) view.findViewById(C1987R.id.workflowBar)).setLeftClickListener(new androidx.viewpager.widget.c(this, 9));
    }
}
