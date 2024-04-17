package com.withings.wiscale2.device.common.feature.vascularage.ui;

import android.content.Context;
import android.content.Intent;
import com.withings.wiscale2.C1987R;
import com.withings.wiscale2.device.common.tutorial.media.MediaTutorialActivity;
import kotlin.Metadata;
import kotlin.collections.s0;
import kotlin.jvm.internal.u;
import nm0.j;
/* compiled from: WBS04VascularAgeTutorialActivity.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/withings/wiscale2/device/common/feature/vascularage/ui/WBS04VascularAgeTutorialActivity;", "Lcom/withings/wiscale2/device/common/tutorial/media/MediaTutorialActivity;", "<init>", "()V", "a", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class WBS04VascularAgeTutorialActivity extends MediaTutorialActivity {

    /* renamed from: n  reason: collision with root package name */
    public static final /* synthetic */ int f52612n = 0;

    /* compiled from: WBS04VascularAgeTutorialActivity.kt */
    /* loaded from: classes5.dex */
    public static final class a {
        public static Intent a(Context context, String str, String str2) {
            u.j(context, "context");
            boolean e11 = u.e(str, "activation");
            Integer valueOf = Integer.valueOf((int) C1987R.id.action_results_to_activation);
            Integer valueOf2 = Integer.valueOf((int) C1987R.id.results_fragment);
            Integer valueOf3 = Integer.valueOf((int) C1987R.id.action_best_practices_to_results);
            Integer valueOf4 = Integer.valueOf((int) C1987R.id.best_practices_fragment);
            Integer valueOf5 = Integer.valueOf((int) C1987R.id.action_measure_process_to_best_practices);
            Integer valueOf6 = Integer.valueOf((int) C1987R.id.measure_process_fragment);
            Integer valueOf7 = Integer.valueOf((int) C1987R.id.action_life_to_measure_process);
            Integer valueOf8 = Integer.valueOf((int) C1987R.id.life_fragment);
            Integer valueOf9 = Integer.valueOf((int) C1987R.id.action_discover_to_life);
            Integer valueOf10 = Integer.valueOf((int) C1987R.id.discover_fragment);
            if (e11) {
                return MediaTutorialActivity.a.a(MediaTutorialActivity.f53587l, context, s0.j(new j(valueOf10, valueOf9), new j(valueOf8, valueOf7), new j(valueOf6, valueOf5), new j(valueOf4, valueOf3), new j(valueOf2, valueOf)), C1987R.id.discover_fragment, str2);
            }
            if (u.e(str, "evolution")) {
                return MediaTutorialActivity.a.a(MediaTutorialActivity.f53587l, context, s0.j(new j(Integer.valueOf((int) C1987R.id.evolution_fragment), Integer.valueOf((int) C1987R.id.action_evolution_to_discover)), new j(valueOf10, valueOf9), new j(valueOf8, valueOf7), new j(valueOf6, valueOf5), new j(valueOf4, valueOf3), new j(valueOf2, valueOf)), C1987R.id.evolution_fragment, str2);
            }
            return MediaTutorialActivity.a.a(MediaTutorialActivity.f53587l, context, s0.j(new j(valueOf10, valueOf9), new j(valueOf8, valueOf7), new j(valueOf6, valueOf5), new j(valueOf4, valueOf3), new j(valueOf2, Integer.valueOf((int) C1987R.id.action_results_to_init))), C1987R.id.discover_fragment, str2);
        }
    }
}
