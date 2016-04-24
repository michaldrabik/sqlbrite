package com.example.sqlbrite.todo;

import com.example.sqlbrite.todo.ui.ItemsFragment;
import com.example.sqlbrite.todo.ui.ListsFragment;
import com.example.sqlbrite.todo.ui.NewItemFragment;
import com.example.sqlbrite.todo.ui.NewListFragment;
import dagger.Component;
import javax.inject.Singleton;

@Singleton
@Component(modules = TodoModule.class)
public interface TodoComponent {

  void inject(ListsFragment fragment);

  void inject(ItemsFragment fragment);

  void inject(NewItemFragment fragment);

  void inject(NewListFragment fragment);
}
