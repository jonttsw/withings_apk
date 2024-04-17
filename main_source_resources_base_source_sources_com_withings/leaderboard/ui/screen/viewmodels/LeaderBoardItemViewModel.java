package com.withings.leaderboard.ui.screen.viewmodels;

import androidx.lifecycle.g1;
import com.withings.leaderboard.domain.GetLeaderBoardItemUseCase;
import com.withings.leaderboard.ui.screen.LeaderBoardUiEntry;
import com.withings.wiscale2.food.ui.display.FoodDayFragment;
import hn.a;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.flow.Flow;
import org.joda.time.DateTime;
/* compiled from: LeaderBoardItemViewModel.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lcom/withings/leaderboard/ui/screen/viewmodels/LeaderBoardItemViewModel;", "Landroidx/lifecycle/g1;", "Lorg/joda/time/DateTime;", FoodDayFragment.ARG_DAY, "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/withings/leaderboard/ui/screen/LeaderBoardUiEntry;", "getLeaderBoardEntryFlow", "(Lorg/joda/time/DateTime;)Lkotlinx/coroutines/flow/Flow;", "Lcom/withings/leaderboard/domain/GetLeaderBoardItemUseCase;", "getLeaderboard", "Lcom/withings/leaderboard/domain/GetLeaderBoardItemUseCase;", "<init>", "(Lcom/withings/leaderboard/domain/GetLeaderBoardItemUseCase;)V", "leaderboard_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class LeaderBoardItemViewModel extends g1 {
    public static final int $stable = 8;
    private final GetLeaderBoardItemUseCase getLeaderboard;

    @Inject
    public LeaderBoardItemViewModel(GetLeaderBoardItemUseCase getLeaderboard) {
        u.j(getLeaderboard, "getLeaderboard");
        this.getLeaderboard = getLeaderboard;
    }

    public final Flow<List<LeaderBoardUiEntry>> getLeaderBoardEntryFlow(DateTime day) {
        u.j(day, "day");
        GetLeaderBoardItemUseCase getLeaderBoardItemUseCase = this.getLeaderboard;
        String abstractDateTime = a.s(day).toString("yyyy-MM-dd");
        u.i(abstractDateTime, "toString(...)");
        return getLeaderBoardItemUseCase.invoke(abstractDateTime);
    }
}
