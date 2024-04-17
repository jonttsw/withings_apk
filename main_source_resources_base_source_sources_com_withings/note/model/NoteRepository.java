package com.withings.note.model;

import android.content.Context;
import android.util.Pair;
import androidx.health.connect.client.records.CervicalMucusRecord;
import androidx.lifecycle.LiveData;
import com.withings.healthplus.navigation.ui.navigation.NavigationArguments;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.user.User;
import java.util.List;
import kotlin.Metadata;
import org.jivesoftware.smackx.disco.packet.DiscoverItems;
/* compiled from: NoteRepository.kt */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0013\bf\u0018\u00002\u00020\u0001J\u0015\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00022\u0006\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\bH&¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\bH&¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\b0\u00022\u0006\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\u0015\u0010\nJ\u0017\u0010\u0016\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\bH&¢\u0006\u0004\b\u0016\u0010\u000eJ\u000f\u0010\u0017\u001a\u00020\fH&¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\u0019\u0010\u001aJ)\u0010\u001d\u001a\u00020\f2\u0018\u0010\u001c\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u001b0\u0002H&¢\u0006\u0004\b\u001d\u0010\u001eJ\u0019\u0010 \u001a\u0004\u0018\u00010\b2\u0006\u0010\u001f\u001a\u00020\u0006H&¢\u0006\u0004\b \u0010!J\u001f\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\"2\u0006\u0010\u001f\u001a\u00020\u0006H&¢\u0006\u0004\b#\u0010$J\u0019\u0010%\u001a\u0004\u0018\u00010\b2\u0006\u0010\u001f\u001a\u00020\u0006H&¢\u0006\u0004\b%\u0010!J\u001f\u0010&\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\"2\u0006\u0010\u001f\u001a\u00020\u0006H&¢\u0006\u0004\b&\u0010$J\u0015\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&¢\u0006\u0004\b'\u0010\u0005J\u0017\u0010)\u001a\u00020\f2\u0006\u0010(\u001a\u00020\u0003H&¢\u0006\u0004\b)\u0010*J\u0017\u0010+\u001a\u00020\f2\u0006\u0010(\u001a\u00020\u0003H&¢\u0006\u0004\b+\u0010*J\u0017\u0010,\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\bH&¢\u0006\u0004\b,\u0010\u000eJ\u0017\u0010-\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\bH&¢\u0006\u0004\b-\u0010\u000eJ'\u0010.\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\bH&¢\u0006\u0004\b.\u0010\u0014J\u001f\u00100\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00022\u0006\u0010/\u001a\u00020\u0006H&¢\u0006\u0004\b0\u0010\nJ\u001f\u00102\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00022\u0006\u00101\u001a\u00020\u0006H&¢\u0006\u0004\b2\u0010\nJ%\u00103\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00020\"2\u0006\u0010/\u001a\u00020\u0006H&¢\u0006\u0004\b3\u0010$J%\u00104\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00020\"2\u0006\u00101\u001a\u00020\u0006H&¢\u0006\u0004\b4\u0010$¨\u00065À\u0006\u0003"}, d2 = {"Lcom/withings/note/model/NoteRepository;", "", "", "Lcom/withings/note/model/Note;", "getAllNotes", "()Ljava/util/List;", "", NavigationArguments.USER_ID, "Lcom/withings/note/model/NoteGroup;", "getSignalsNoteGroups", "(J)Ljava/util/List;", "noteGroup", "Lnm0/y;", "insertOrUpdateNoteGroup", "(Lcom/withings/note/model/NoteGroup;)V", "Landroid/content/Context;", ConstantsWs.JSON_ACCOUNT_KEY_CONTEXT, "Lcom/withings/user/User;", ConstantsWs.SCREEN_DISPLAY_CONTEXT_KEY_USER_SCREENS_SHORT, "insertOrUpdateNoteGroupAndSync", "(Landroid/content/Context;Lcom/withings/user/User;Lcom/withings/note/model/NoteGroup;)V", "getNotSyncedNoteGroupsForUser", DiscoverItems.Item.UPDATE_ACTION, CervicalMucusRecord.Appearance.CLEAR, "()V", "getLastUpdate", "(J)J", "Landroid/util/Pair;", "wsAndLocaIds", "updateNotesForMeasureGroups", "(Ljava/util/List;)V", "signalId", "getLocalNoteGroupForId", "(J)Lcom/withings/note/model/NoteGroup;", "Landroidx/lifecycle/LiveData;", "getLocalNoteGroupLiveDataForId", "(J)Landroidx/lifecycle/LiveData;", "getRemoteNoteGroupForId", "getRemoteNoteGroupLiveDataForId", "getDeletedNotes", ConstantsWs.REDOX_DATA_MODEL_NOTE, "deleteNote", "(Lcom/withings/note/model/Note;)V", "softDeleteNote", "deleteNoteGroup", "softDeleteNoteGroup", "deleteNoteGroupAndSync", "wsId", "getNoteGroupForMeasureGroupWsId", "id", "getNoteGroupForMeasureGroupDbId", "getNoteGroupLiveDataForMeasureGroupWsId", "getNoteGroupLiveDataForMeasureGroupDbId", "note_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public interface NoteRepository {
    void clear();

    void deleteNote(Note note);

    void deleteNoteGroup(NoteGroup noteGroup);

    void deleteNoteGroupAndSync(Context context, User user, NoteGroup noteGroup);

    List<Note> getAllNotes();

    List<Note> getDeletedNotes();

    long getLastUpdate(long j5);

    NoteGroup getLocalNoteGroupForId(long j5);

    LiveData<NoteGroup> getLocalNoteGroupLiveDataForId(long j5);

    List<NoteGroup> getNotSyncedNoteGroupsForUser(long j5);

    List<NoteGroup> getNoteGroupForMeasureGroupDbId(long j5);

    List<NoteGroup> getNoteGroupForMeasureGroupWsId(long j5);

    LiveData<List<NoteGroup>> getNoteGroupLiveDataForMeasureGroupDbId(long j5);

    LiveData<List<NoteGroup>> getNoteGroupLiveDataForMeasureGroupWsId(long j5);

    NoteGroup getRemoteNoteGroupForId(long j5);

    LiveData<NoteGroup> getRemoteNoteGroupLiveDataForId(long j5);

    List<NoteGroup> getSignalsNoteGroups(long j5);

    void insertOrUpdateNoteGroup(NoteGroup noteGroup);

    void insertOrUpdateNoteGroupAndSync(Context context, User user, NoteGroup noteGroup);

    void softDeleteNote(Note note);

    void softDeleteNoteGroup(NoteGroup noteGroup);

    void update(NoteGroup noteGroup);

    void updateNotesForMeasureGroups(List<? extends Pair<Long, Long>> list);
}
