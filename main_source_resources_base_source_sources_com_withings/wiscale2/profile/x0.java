package com.withings.wiscale2.profile;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.target.Target;
import com.withings.user.User;
import com.withings.wiscale2.C1987R;
import com.withings.wiscale2.activity.workout.goal.ui.WorkoutGoalActivity;
import com.withings.wiscale2.measure.goal.ui.StepGoalActivity;
import com.withings.wiscale2.measure.goal.ui.WeightGoalActivity;
import com.withings.wiscale2.profile.ProfileTargetView;
import com.withings.workout.category.model.WorkoutCategory;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import jm.a;
import l70.u;
/* compiled from: ProfileTargetView.kt */
/* loaded from: classes5.dex */
public final class x0 extends RecyclerView.Adapter<h1> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ProfileTargetView f59492a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public x0(ProfileTargetView profileTargetView) {
        this.f59492a = profileTargetView;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        List list;
        list = this.f59492a.f59271b;
        return list.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(h1 h1Var, int i11) {
        final User user;
        List list;
        boolean z5;
        final h1 holder = h1Var;
        kotlin.jvm.internal.u.j(holder, "holder");
        ProfileTargetView profileTargetView = this.f59492a;
        final ProfileTargetView.a delegate = profileTargetView.getDelegate();
        user = profileTargetView.f59272c;
        if (user != null) {
            list = profileTargetView.f59271b;
            d1 targetContainer = (d1) ((ArrayList) list).get(i11);
            kotlin.jvm.internal.u.j(targetContainer, "targetContainer");
            final Target a11 = targetContainer.a();
            final Context context = holder.a().getContext();
            if (a11.getMeasureType() == 36 && a11.getType() == 2) {
                holder.b().setImageResource(C1987R.drawable.icon_medium_activity_walk);
                holder.c().setText(zq.b.b(holder, C1987R.string._DAILY_STEPS_));
                holder.d().setText(NumberFormat.getIntegerInstance().format(targetContainer.a().getMantissa()));
            } else {
                if (a11.getMeasureType() == 1 && a11.getType() == 1) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (z5) {
                    holder.b().setImageResource(C1987R.drawable.icon_medium_device_bodytype);
                    holder.c().setText(zq.b.b(holder, C1987R.string._WEIGHT_));
                    TextView d11 = holder.d();
                    Context context2 = holder.d().getContext();
                    kotlin.jvm.internal.u.i(context2, "getContext(...)");
                    l70.u g11 = a.d.a(context2).g(1);
                    Context context3 = holder.d().getContext();
                    kotlin.jvm.internal.u.i(context3, "getContext(...)");
                    double asDouble = targetContainer.a().getAsDouble();
                    u.a aVar = l70.u.f78815b;
                    d11.setText(g11.g(context3, asDouble, null));
                } else if (targetContainer.b() != null) {
                    WorkoutCategory b10 = targetContainer.b();
                    holder.b().setImageResource(b10.getGlyphRes());
                    holder.c().setText(b10.getName(holder.c().getContext()));
                    holder.d().setText(String.format("%d X", Arrays.copyOf(new Object[]{Integer.valueOf(targetContainer.a().getMantissa())}, 1)));
                }
            }
            holder.a().setOnClickListener(new View.OnClickListener() { // from class: com.withings.wiscale2.profile.g1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Intent a12;
                    h1 this$0 = holder;
                    kotlin.jvm.internal.u.j(this$0, "this$0");
                    Target target = a11;
                    kotlin.jvm.internal.u.j(target, "$target");
                    User user2 = user;
                    kotlin.jvm.internal.u.j(user2, "$user");
                    ProfileTargetView.a aVar2 = ProfileTargetView.a.this;
                    if (aVar2 != null) {
                        Context context4 = context;
                        kotlin.jvm.internal.u.g(context4);
                        if (target.getMeasureType() == 36 && target.getType() == 2) {
                            a12 = StepGoalActivity.I3(context4, user2);
                        } else if (target.getMeasureType() == 1 && target.getType() == 1) {
                            a12 = WeightGoalActivity.D3(context4, user2);
                        } else {
                            int i12 = WorkoutGoalActivity.f48710g;
                            a12 = WorkoutGoalActivity.a.a(target.getMeasureType(), context4, user2);
                        }
                        aVar2.a0(a12);
                    }
                }
            });
            return;
        }
        kotlin.jvm.internal.u.s(ConstantsWs.SCREEN_DISPLAY_CONTEXT_KEY_USER_SCREENS_SHORT);
        throw null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final h1 onCreateViewHolder(ViewGroup parent, int i11) {
        kotlin.jvm.internal.u.j(parent, "parent");
        return new h1(androidx.collection.c.n(parent, C1987R.layout.cell_item_profile_target));
    }
}
