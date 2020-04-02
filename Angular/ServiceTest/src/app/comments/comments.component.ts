import { CommentService } from './comment.service';
import { Component, OnInit } from '@angular/core';
import { Comment } from './comment.modelo';

@Component({
  selector: 'app-comments',
  templateUrl: './comments.component.html',
  styleUrls: ['./comments.component.css']
})
export class CommentsComponent implements OnInit {


  comments : Comment [];

  constructor(private CommentService: CommentService) { }

  ngOnInit(): void {
    this.CommentService.getComments().subscribe(comments => this.comments = comments);
  }

}
