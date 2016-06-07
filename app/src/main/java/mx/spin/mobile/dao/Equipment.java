package mx.spin.mobile.dao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT. Enable "keep" sections if you want to edit. 

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Entity mapped to table "EQUIPMENT".
 */
public class Equipment implements Parcelable {

    private Long id;
    private Integer pool_id;
    private Integer pooleq_id;
    private Integer pooleq_equipment_id;
    private String pooleq_qty;
    private String pooleq_hp;
    private String Equipment;

    public Equipment() {
    }

    public Equipment(Long id) {
        this.id = id;
    }

    public Equipment(Long id, Integer pool_id, Integer pooleq_id, Integer pooleq_equipment_id, String pooleq_qty, String pooleq_hp, String Equipment) {
        this.id = id;
        this.pool_id = pool_id;
        this.pooleq_id = pooleq_id;
        this.pooleq_equipment_id = pooleq_equipment_id;
        this.pooleq_qty = pooleq_qty;
        this.pooleq_hp = pooleq_hp;
        this.Equipment = Equipment;
    }

    protected Equipment(Parcel in) {
        pooleq_qty = in.readString();
        pooleq_hp = in.readString();
        Equipment = in.readString();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(pooleq_qty);
        dest.writeString(pooleq_hp);
        dest.writeString(Equipment);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<Equipment> CREATOR = new Creator<Equipment>() {
        @Override
        public Equipment createFromParcel(Parcel in) {
            return new Equipment(in);
        }

        @Override
        public Equipment[] newArray(int size) {
            return new Equipment[size];
        }
    };

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getPool_id() {
        return pool_id;
    }

    public void setPool_id(Integer pool_id) {
        this.pool_id = pool_id;
    }

    public Integer getPooleq_id() {
        return pooleq_id;
    }

    public void setPooleq_id(Integer pooleq_id) {
        this.pooleq_id = pooleq_id;
    }

    public Integer getPooleq_equipment_id() {
        return pooleq_equipment_id;
    }

    public void setPooleq_equipment_id(Integer pooleq_equipment_id) {
        this.pooleq_equipment_id = pooleq_equipment_id;
    }

    public String getPooleq_qty() {
        return pooleq_qty;
    }

    public void setPooleq_qty(String pooleq_qty) {
        this.pooleq_qty = pooleq_qty;
    }

    public String getPooleq_hp() {
        return pooleq_hp;
    }

    public void setPooleq_hp(String pooleq_hp) {
        this.pooleq_hp = pooleq_hp;
    }

    public String getEquipment() {
        return Equipment;
    }

    public void setEquipment(String Equipment) {
        this.Equipment = Equipment;
    }

}
