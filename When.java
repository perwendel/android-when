/*
 * Copyright 2016 - Per Wendel
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package sonymobile.com.fourgetaboutit;

import android.support.v4.view.ViewPager;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

/**
 * Utility class for setting an event listeners on a {@link View}
 */
public class When {

    /**
     * Adds a click listener to a {@link View}. Preferably the creation of the OnClickListener is done and returned in
     * a separate method with a name that explains the "action" e.g.
     * When.clicked(view, openTrackDetails());
     * That method should be documented to explain that it doesn't execute the action the name implies and instead
     * returns a listener instance that when invoked executes the action.
     *
     * @param view     the View to add the click listener to
     * @param listener the OnClickListener to set on the view
     */
    public static void clicked(View view, View.OnClickListener listener) {
        view.setOnClickListener(listener);
    }

    /**
     * Adds a long click listener to a {@link View}. Preferably the creation of the OnLongClickListener is done and returned in
     * a separate method with a name that explains the "action" e.g.
     * When.longClicked(view, showHint());
     * That method should be documented to explain that it doesn't execute the action the name implies and instead
     * returns a listener instance that when invoked executes the action.
     *
     * @param view     the View to add the click listener to
     * @param listener the OnLongClickListener to set on the view
     */
    public static void longClicked(View view, View.OnLongClickListener listener) {
        view.setOnLongClickListener(listener);
    }

    /**
     * Adds a click listener to a {@link ListView}. Preferably the creation of the OnItemClickListener is done and
     * returned in a separate method with a name that explains the "action" e.g.
     * When.clicked(listView, openTrackDetails());
     * That method should be documented to explain that it doesn't execute the action the name implies and instead
     * returns a listener instance that when invoked executes the action.
     *
     * @param listView the list View to add the item click listener to
     * @param listener the OnItemClickListener to set on the view
     */
    public static void clicked(ListView listView, AdapterView.OnItemClickListener listener) {
        listView.setOnItemClickListener(listener);
    }

    /**
     * Adds a touch listener to a {@link View} Preferably the creation of the OnTouchListener is done and returned in
     * a separate method with a name that explains the "action" e.g.
     * When.touch(view, openTrackDetails());
     * That method should be documented to explain that it doesn't execute the action the name implies and instead
     * returns a listener instance that when invoked executes the action.
     *
     * @param view     the View to add the click listener to
     * @param listener the OnTouchListener to set on the view
     */
    public static void touched(View view, View.OnTouchListener listener) {
        view.setOnTouchListener(listener);
    }

    /**
     * Adds a layout changed listener to a {@link View} Preferably the creation of the addLayoutChangedListener
     * is done and returned in a separate method with a name that explains the "action" e.g.
     * When.layoutChanged(view, changeBackgroundColor());
     * That method should be documented to explain that it doesn't execute the action the name implies and instead
     * returns a listener instance that when invoked executes the action.
     *
     * @param view     the View to add the click listener to
     * @param listener the OnTouchListener to set on the view
     */
    public static void layoutChanged(View view, View.OnLayoutChangeListener listener) {
        view.addOnLayoutChangeListener(listener);
    }

    /**
     * Adds a selection listener to a {@link AdapterView} Preferably the creation of the OnItemSelectedListener is done and returned in
     * a separate method with a name that explains the "action" e.g.
     * When.touch(adapterView, openCountrySelector());
     * That method should be documented to explain that it doesn't execute the action the name implies and instead
     * returns a listener instance that when invoked executes the action.
     *
     * @param view     the View to add the click listener to
     * @param listener the OnItemSelectedListener to set on the view
     */
    public static void itemSelectedIn(AdapterView view, AdapterView.OnItemSelectedListener listener) {
        view.setOnItemSelectedListener(listener);
    }

    /**
     * Adds a change listener to a {@link ViewPager} Preferably the creation of the addOnPageListener is done and returned in
     * a separate method with a name that explains the "action" e.g.
     * When.touch(viewPager, onPageChanged());
     * That method should be documented to explain that it doesn't execute the action the name implies and instead
     * returns a listener instance that when invoked executes the action.
     *
     * @param view     the View to add the click listener to
     * @param listener the addOnPageChangeListener to set on the view
     */
    public static void pageChanged(ViewPager view, ViewPager.OnPageChangeListener listener) {
        view.addOnPageChangeListener(listener);
    }
}
