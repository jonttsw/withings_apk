package com.withings.leaderboard.utils;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.withings.leaderboard.ui.screen.LeaderBoardUiEntry;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.collections.x;
import kotlin.jvm.internal.u;
/* compiled from: FilterLeaderBoardEntryUseCase.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007\b\u0007¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004J\u001a\u0010\u0007\u001a\u00020\u0005*\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\tH\u0002J\u0014\u0010\n\u001a\u0004\u0018\u00010\u0005*\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002¨\u0006\u000b"}, d2 = {"Lcom/withings/leaderboard/utils/FilterLeaderBoardEntryUseCase;", "", "()V", "getItemLeaderBoardList", "", "Lcom/withings/leaderboard/ui/screen/LeaderBoardUiEntry;", RemoteConfigConstants.ResponseFieldKey.ENTRIES, "getLowestAbove", FirebaseAnalytics.Param.SCORE, "", "getMainUser", "leaderboard_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FilterLeaderBoardEntryUseCase {
    public static final int $stable = 0;

    private final LeaderBoardUiEntry getLowestAbove(List<LeaderBoardUiEntry> list, int i11) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((LeaderBoardUiEntry) obj).getScore() > i11) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            Object next = it.next();
            if (it.hasNext()) {
                int score = ((LeaderBoardUiEntry) next).getScore();
                do {
                    Object next2 = it.next();
                    int score2 = ((LeaderBoardUiEntry) next2).getScore();
                    if (score > score2) {
                        next = next2;
                        score = score2;
                    }
                } while (it.hasNext());
                return (LeaderBoardUiEntry) next;
            }
            return (LeaderBoardUiEntry) next;
        }
        throw new NoSuchElementException();
    }

    private final LeaderBoardUiEntry getMainUser(List<LeaderBoardUiEntry> list) {
        Object obj;
        Iterator<T> it = list.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (((LeaderBoardUiEntry) obj).isMainUser()) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        return (LeaderBoardUiEntry) obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final List<LeaderBoardUiEntry> getItemLeaderBoardList(List<LeaderBoardUiEntry> entries) {
        u.j(entries, "entries");
        LeaderBoardUiEntry mainUser = getMainUser(entries);
        List<LeaderBoardUiEntry> D0 = x.D0(entries, new Comparator() { // from class: com.withings.leaderboard.utils.FilterLeaderBoardEntryUseCase$getItemLeaderBoardList$$inlined$sortedByDescending$1
            @Override // java.util.Comparator
            public final int compare(T t11, T t12) {
                return pm0.a.b(Integer.valueOf(((LeaderBoardUiEntry) t12).getScore()), Integer.valueOf(((LeaderBoardUiEntry) t11).getScore()));
            }
        });
        if (entries.size() > 3) {
            if (mainUser == null) {
                return x.H0(D0, 3);
            }
            if (D0.indexOf(mainUser) < 3) {
                return x.H0(D0, 3);
            }
            return x.W(x.I(D0), getLowestAbove(D0, mainUser.getScore()), mainUser);
        }
        return D0;
    }
}
