package com.withings.note.model;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
/* compiled from: Note.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0018\u0018\u00002\u00020\u0001BU\u0012\u0006\u0010\u0013\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u0010\u0012\b\u0010\"\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010#\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010$\u001a\u00020\r\u0012\u0006\u0010%\u001a\u00020\u0002¢\u0006\u0004\b&\u0010'J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0000H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0011\u0010\t\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\"\u0010\u0013\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0006R$\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\n\"\u0004\b\u001b\u0010\u001cR\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\u0019R\"\u0010\u001d\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010\u0012\"\u0004\b \u0010!¨\u0006("}, d2 = {"Lcom/withings/note/model/NoteHealthAttribute;", "Lcom/withings/note/model/Note;", "", "wsId", "Lnm0/y;", "setWsId", "(J)V", "copy", "()Lcom/withings/note/model/NoteHealthAttribute;", "getWsId", "()Ljava/lang/Long;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "healthAttributeRemoteId", "J", "getHealthAttributeRemoteId", "()J", "setHealthAttributeRemoteId", "healthAttributeLocalId", "Ljava/lang/Long;", "getHealthAttributeLocalId", "setHealthAttributeLocalId", "(Ljava/lang/Long;)V", "type", "I", "getType", "setType", "(I)V", "noteGroupId", "localNoteGroupId", "deleted", "modified", "<init>", "(JLjava/lang/Long;Ljava/lang/Long;ILjava/lang/Long;Ljava/lang/Long;ZJ)V", "note_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class NoteHealthAttribute extends Note {
    private Long healthAttributeLocalId;
    @SerializedName("id")
    private long healthAttributeRemoteId;
    private int type;
    @SerializedName("id_asso")
    private Long wsId;

    public /* synthetic */ NoteHealthAttribute(long j5, Long l5, Long l6, int i11, Long l11, Long l12, boolean z5, long j11, int i12, m mVar) {
        this(j5, (i12 & 2) != 0 ? null : l5, (i12 & 4) != 0 ? null : l6, (i12 & 8) != 0 ? 0 : i11, l11, l12, z5, j11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NoteHealthAttribute)) {
            return false;
        }
        NoteHealthAttribute noteHealthAttribute = (NoteHealthAttribute) obj;
        if (hasSameId(noteHealthAttribute) && noteHealthAttribute.healthAttributeRemoteId == this.healthAttributeRemoteId && this.type == noteHealthAttribute.type) {
            return true;
        }
        return false;
    }

    public final Long getHealthAttributeLocalId() {
        return this.healthAttributeLocalId;
    }

    public final long getHealthAttributeRemoteId() {
        return this.healthAttributeRemoteId;
    }

    public final int getType() {
        return this.type;
    }

    @Override // com.withings.note.model.Note
    public Long getWsId() {
        return this.wsId;
    }

    public int hashCode() {
        return 0;
    }

    public final void setHealthAttributeLocalId(Long l5) {
        this.healthAttributeLocalId = l5;
    }

    public final void setHealthAttributeRemoteId(long j5) {
        this.healthAttributeRemoteId = j5;
    }

    public final void setType(int i11) {
        this.type = i11;
    }

    @Override // com.withings.note.model.Note
    public void setWsId(long j5) {
        this.wsId = Long.valueOf(j5);
    }

    public NoteHealthAttribute(long j5, Long l5, Long l6, int i11, Long l11, Long l12, boolean z5, long j11) {
        super(j5, l11, l12, z5, null, j11, 16, null);
        this.healthAttributeRemoteId = j5;
        this.healthAttributeLocalId = l5;
        this.wsId = l6;
        this.type = i11;
    }

    @Override // com.withings.note.model.Note
    public NoteHealthAttribute copy() {
        return new NoteHealthAttribute(this.healthAttributeRemoteId, null, this.wsId, this.type, getNoteGroupId(), getLocalNoteGroupId(), getDeleted(), getModified(), 2, null);
    }
}
