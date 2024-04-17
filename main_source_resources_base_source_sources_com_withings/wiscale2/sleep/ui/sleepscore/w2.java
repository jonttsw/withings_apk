package com.withings.wiscale2.sleep.ui.sleepscore;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.withings.user.core.models.User;
import com.withings.wiscale2.C1987R;
import com.withings.wiscale2.sleep.ui.sleepscore.SecondarySleepActivity;
import com.withings.wiscale2.track.data.Track;
import com.withings.wiscale2.track.data.TrackKt;
import org.joda.time.DateTime;
/* compiled from: SleepNapListActivity.kt */
/* loaded from: classes5.dex */
public final class w2 extends RecyclerView.z {

    /* renamed from: a  reason: collision with root package name */
    private View f61548a;

    /* renamed from: b  reason: collision with root package name */
    private TextView f61549b;

    public w2(View view) {
        super(view);
        View findViewById = view.findViewById(C1987R.id.nap_container);
        kotlin.jvm.internal.u.i(findViewById, "findViewById(...)");
        this.f61548a = findViewById;
        View findViewById2 = view.findViewById(C1987R.id.nap_value);
        kotlin.jvm.internal.u.i(findViewById2, "findViewById(...)");
        this.f61549b = (TextView) findViewById2;
    }

    public static void a(w2 this$0, User user, Track track) {
        kotlin.jvm.internal.u.j(this$0, "this$0");
        kotlin.jvm.internal.u.j(user, "$user");
        kotlin.jvm.internal.u.j(track, "$track");
        View view = this$0.f61548a;
        Context context = view.getContext();
        SecondarySleepActivity.a aVar = SecondarySleepActivity.f60530u;
        Context context2 = view.getContext();
        kotlin.jvm.internal.u.i(context2, "getContext(...)");
        Long id2 = track.getId();
        kotlin.jvm.internal.u.g(id2);
        long longValue = id2.longValue();
        aVar.getClass();
        androidx.core.content.a.startActivity(context, SecondarySleepActivity.a.a(context2, user, longValue), null);
    }

    public final void b(final Track track, pm.e durationFormatter, final User user) {
        kotlin.jvm.internal.u.j(track, "track");
        kotlin.jvm.internal.u.j(durationFormatter, "durationFormatter");
        kotlin.jvm.internal.u.j(user, "user");
        DateTime effectiveStartDate = TrackKt.getEffectiveStartDate(track);
        TextView textView = this.f61549b;
        Context context = textView.getContext();
        kotlin.jvm.internal.u.i(context, "getContext(...)");
        String t11 = b50.b.t(context, effectiveStartDate);
        String a11 = durationFormatter.a(track.getDuration());
        textView.setText(t11 + " - " + a11);
        this.f61548a.setOnClickListener(new View.OnClickListener() { // from class: com.withings.wiscale2.sleep.ui.sleepscore.v2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                w2.a(w2.this, user, track);
            }
        });
    }
}
