package com.withings.wiscale2.device.common.feature.workout;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import com.samsung.android.sdk.healthdata.HealthUserProfile;
import com.withings.wiscale2.C1987R;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
/* compiled from: WorkoutTutorialNavigation.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/withings/wiscale2/device/common/feature/workout/WorkoutNoBluetoothFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class WorkoutNoBluetoothFragment extends Fragment {

    /* renamed from: c  reason: collision with root package name */
    private TextView f52625c;

    /* renamed from: d  reason: collision with root package name */
    private TextView f52626d;

    /* renamed from: e  reason: collision with root package name */
    private ImageView f52627e;

    public WorkoutNoBluetoothFragment() {
        super(C1987R.layout.fragment_setup);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        ImageView imageView = this.f52627e;
        if (imageView != null) {
            imageView.setVisibility(0);
            TextView textView = this.f52626d;
            if (textView != null) {
                textView.setVisibility(0);
                TextView textView2 = this.f52625c;
                if (textView2 != null) {
                    textView2.setText(getString(C1987R.string.hwa09_tutorial_workout_noBluetooth_title));
                    TextView textView3 = this.f52626d;
                    if (textView3 != null) {
                        textView3.setText(getString(C1987R.string.hwa09_tutorial_workout_noBluetooth_description));
                        ImageView imageView2 = this.f52627e;
                        if (imageView2 != null) {
                            imageView2.setImageResource(2131232743);
                            return;
                        } else {
                            u.s(HealthUserProfile.USER_PROFILE_KEY_IMAGE);
                            throw null;
                        }
                    }
                    u.s("secondaryTextView");
                    throw null;
                }
                u.s("primaryTextView");
                throw null;
            }
            u.s("secondaryTextView");
            throw null;
        }
        u.s(HealthUserProfile.USER_PROFILE_KEY_IMAGE);
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        u.j(view, "view");
        super.onViewCreated(view, bundle);
        ay.b.n(view, false, true, 23);
        View findViewById = view.findViewById(C1987R.id.root);
        u.i(findViewById, "findViewById(...)");
        ConstraintLayout constraintLayout = (ConstraintLayout) findViewById;
        View findViewById2 = view.findViewById(C1987R.id.setup_primary_text);
        u.i(findViewById2, "findViewById(...)");
        this.f52625c = (TextView) findViewById2;
        View findViewById3 = view.findViewById(C1987R.id.setup_secondary_text);
        u.i(findViewById3, "findViewById(...)");
        this.f52626d = (TextView) findViewById3;
        View findViewById4 = view.findViewById(C1987R.id.setup_image);
        u.i(findViewById4, "findViewById(...)");
        this.f52627e = (ImageView) findViewById4;
    }
}
