package com.withings.healthplus.contentscreens.ui.viewmodel;

import androidx.lifecycle.u0;
import ax.c;
import ax.h;
import ax.i;
import com.withings.healthplus.navigation.ui.navigation.NavigationArguments;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import ou.f;
import yw.a;
/* compiled from: ContentWorkoutPlayerViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/healthplus/contentscreens/ui/viewmodel/ContentWorkoutPlayerViewModel;", "Lou/f;", "ui_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class ContentWorkoutPlayerViewModel extends f {

    /* renamed from: p  reason: collision with root package name */
    private final String f40197p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @Inject
    public ContentWorkoutPlayerViewModel(u0 savedStateHandle, a liveHrListener, ta0.a aVar, c liveWorkoutCommandSender, h liveWorkoutManager, i liveWorkoutRepository, bx.a sharedLiveWorkoutInfo, m70.i userManager) {
        super(savedStateHandle, liveHrListener, aVar, liveWorkoutCommandSender, liveWorkoutManager, liveWorkoutRepository, sharedLiveWorkoutInfo, userManager);
        u.j(liveHrListener, "liveHrListener");
        u.j(savedStateHandle, "savedStateHandle");
        u.j(userManager, "userManager");
        u.j(sharedLiveWorkoutInfo, "sharedLiveWorkoutInfo");
        u.j(liveWorkoutManager, "liveWorkoutManager");
        u.j(liveWorkoutRepository, "liveWorkoutRepository");
        u.j(liveWorkoutCommandSender, "liveWorkoutCommandSender");
        String str = (String) savedStateHandle.c(NavigationArguments.VIDEO_URL);
        if (str != null) {
            this.f40197p = str;
            return;
        }
        throw new Exception("videoUrl shouldn't be null");
    }

    public final String G0() {
        return this.f40197p;
    }
}
