package com.withings.note.model;

import androidx.lifecycle.LiveData;
import com.withings.healthplus.navigation.ui.navigation.NavigationArguments;
import com.withings.library.authentication.api.ConstantsWs;
import java.util.List;
import kotlin.Metadata;
import org.jivesoftware.smackx.disco.packet.DiscoverItems;
/* compiled from: NoteGroupDao.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u001f\n\u0002\u0018\u0002\n\u0002\b\r\bg\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0005\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H'¢\u0006\u0004\b\u0005\u0010\nJ%\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\fH'¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00070\u000e2\u0006\u0010\u0011\u001a\u00020\u0004H'¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00070\u000e2\u0006\u0010\u0011\u001a\u00020\u0004H'¢\u0006\u0004\b\u0014\u0010\u0013J\u001d\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\u0004H'¢\u0006\u0004\b\u0015\u0010\u0013J\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0016\u001a\u00020\u0004H'¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u0019\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H'¢\u0006\u0004\b\u0019\u0010\nJ\u001f\u0010\u001c\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0004H'¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00070\u000eH'¢\u0006\u0004\b\u001e\u0010\u001fJ\u0015\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00070\u000eH'¢\u0006\u0004\b \u0010\u001fJ\u0017\u0010\"\u001a\u00020\t2\u0006\u0010!\u001a\u00020\u0004H'¢\u0006\u0004\b\"\u0010#J\u0017\u0010$\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u0004H'¢\u0006\u0004\b$\u0010#J\u000f\u0010%\u001a\u00020\tH'¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\tH'¢\u0006\u0004\b'\u0010&J\u0017\u0010(\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0004H'¢\u0006\u0004\b(\u0010)J\u001f\u0010,\u001a\u00020\t2\u0006\u0010*\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\u0004H'¢\u0006\u0004\b,\u0010\u001dJ\u0019\u0010-\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u001b\u001a\u00020\u0004H'¢\u0006\u0004\b-\u0010\u0018J\u001f\u0010/\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020.2\u0006\u0010\u001b\u001a\u00020\u0004H'¢\u0006\u0004\b/\u00100J\u0019\u00101\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u001b\u001a\u00020\u0004H'¢\u0006\u0004\b1\u0010\u0018J\u001f\u00102\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020.2\u0006\u0010\u001b\u001a\u00020\u0004H'¢\u0006\u0004\b2\u00100J\u0017\u00103\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b3\u0010\u001aJ\u0019\u00105\u001a\u0004\u0018\u00010\u00022\u0006\u00104\u001a\u00020\u0004H'¢\u0006\u0004\b5\u0010\u0018J\u001f\u00107\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000e2\u0006\u00106\u001a\u00020\u0004H'¢\u0006\u0004\b7\u0010\u0013J\u001f\u00108\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000e2\u0006\u00106\u001a\u00020\u0004H'¢\u0006\u0004\b8\u0010\u0013J%\u00109\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000e0.2\u0006\u00106\u001a\u00020\u0004H'¢\u0006\u0004\b9\u00100J%\u0010:\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000e0.2\u0006\u00106\u001a\u00020\u0004H'¢\u0006\u0004\b:\u00100¨\u0006;À\u0006\u0003"}, d2 = {"Lcom/withings/note/model/NoteGroupDao;", "", "Lcom/withings/note/model/NoteGroup;", "noteGroup", "", "insertOrUpdate", "(Lcom/withings/note/model/NoteGroup;)J", "Lcom/withings/note/model/NoteEntity;", ConstantsWs.REDOX_DATA_MODEL_NOTE, "Lnm0/y;", "(Lcom/withings/note/model/NoteEntity;)V", NavigationArguments.USER_ID, "", "type", "", "getNotDeletedGroupsForUserAndType", "(JI)Ljava/util/List;", "localNoteGroupId", "getNotesFromNoteGroupId", "(J)Ljava/util/List;", "getNotDeletedNotesFromNoteGroupId", "getNotSyncedGroupsForUser", "noteGroupId", "getById", "(J)Lcom/withings/note/model/NoteGroup;", DiscoverItems.Item.UPDATE_ACTION, "(Lcom/withings/note/model/NoteGroup;)V", "signalId", "updateSignalId", "(JJ)V", "getAllDeletedNotes", "()Ljava/util/List;", "getAllNotes", "localId", "deleteNote", "(J)V", "deleteAllNotesForNotegroupId", "deleteAll", "()V", "deleteAllNotes", "getLastUpdate", "(J)J", "measureGroupId", "localMeasureGroupId", "updateNoteGroupsWithMeasureIds", "getLocalBySignalId", "Landroidx/lifecycle/LiveData;", "getLocalLiveDataBySignalId", "(J)Landroidx/lifecycle/LiveData;", "getRemoteBySignalId", "getRemoteLiveDataBySignalId", "deleteNoteGroup", "wsId", "getNoteGroupForWsId", "id", "getNoteGroupForMeasureGroupWsId", "getNoteGroupForMeasureGroupDbId", "getNoteGroupLiveDataForMeasureGroupWsId", "getNoteGroupLiveDataForMeasureGroupDbId", "note_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public interface NoteGroupDao {
    void deleteAll();

    void deleteAllNotes();

    void deleteAllNotesForNotegroupId(long j5);

    void deleteNote(long j5);

    void deleteNoteGroup(NoteGroup noteGroup);

    List<NoteEntity> getAllDeletedNotes();

    List<NoteEntity> getAllNotes();

    NoteGroup getById(long j5);

    long getLastUpdate(long j5);

    NoteGroup getLocalBySignalId(long j5);

    LiveData<NoteGroup> getLocalLiveDataBySignalId(long j5);

    List<NoteGroup> getNotDeletedGroupsForUserAndType(long j5, int i11);

    List<NoteEntity> getNotDeletedNotesFromNoteGroupId(long j5);

    List<NoteGroup> getNotSyncedGroupsForUser(long j5);

    List<NoteGroup> getNoteGroupForMeasureGroupDbId(long j5);

    List<NoteGroup> getNoteGroupForMeasureGroupWsId(long j5);

    NoteGroup getNoteGroupForWsId(long j5);

    LiveData<List<NoteGroup>> getNoteGroupLiveDataForMeasureGroupDbId(long j5);

    LiveData<List<NoteGroup>> getNoteGroupLiveDataForMeasureGroupWsId(long j5);

    List<NoteEntity> getNotesFromNoteGroupId(long j5);

    NoteGroup getRemoteBySignalId(long j5);

    LiveData<NoteGroup> getRemoteLiveDataBySignalId(long j5);

    long insertOrUpdate(NoteGroup noteGroup);

    void insertOrUpdate(NoteEntity noteEntity);

    void update(NoteEntity noteEntity);

    void update(NoteGroup noteGroup);

    void updateNoteGroupsWithMeasureIds(long j5, long j11);

    void updateSignalId(long j5, long j11);
}
