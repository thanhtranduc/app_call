package com.quickblox.enjoyzz.ui.chats.emoji;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import com.quickblox.enjoyzz.R;
import com.quickblox.enjoyzz.ui.chats.emoji.emojiTypes.EmojiObject;

class EmojiAdapter extends ArrayAdapter<EmojiObject> {

    public EmojiAdapter(Context context, EmojiObject[] data) {
        super(context, R.layout.list_item_emoji, data);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = convertView;
        if (view == null) {
            view = View.inflate(getContext(), R.layout.list_item_emoji, null);
            ViewHolder holder = new ViewHolder();
            holder.iconTextView = (TextView) view.findViewById(R.id.emojicon_icon);
            view.setTag(holder);
        }
        EmojiObject emoji = getItem(position);
        ViewHolder holder = (ViewHolder) view.getTag();
        holder.iconTextView.setText(emoji.getEmoji());
        return view;
    }

    public class ViewHolder {

        TextView iconTextView;
    }
}