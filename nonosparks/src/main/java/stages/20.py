import json
stage='20'
data={}
data['width']=10
data['height']=15
data['name']='Giraffe'
data['hints']={}
data['hints']['horizontal']=['5','2 2 1','3','1 5 4','4 1 3 1','1 3 1 1','1 2 2 1 3','3 2 3 1','1 6 1','1 1']
data['hints']['vertical']=['2 3','1 1','6','2 1 2','3 2','8','2 2 1','1 1','1 1 2','1 2 1','1 1 1','1 1 1','2 1 2','1 2 4','1 1']
data['answer']=[]
data['answer'].append([0,0,0,1,1,0,1,1,1,0])
data['answer'].append([0,0,0,0,1,0,0,1,0,0])
data['answer'].append([0,0,0,1,1,1,1,1,1,0])
data['answer'].append([0,0,0,1,1,0,1,0,1,1])
data['answer'].append([0,1,1,1,0,0,0,1,1,0])
data['answer'].append([0,1,1,1,1,1,1,1,1,0])
data['answer'].append([0,0,1,1,0,1,1,0,1,0])
data['answer'].append([0,0,0,0,0,1,0,0,1,0])
data['answer'].append([0,1,0,0,1,0,1,1,0,0])
data['answer'].append([0,1,0,0,1,1,0,1,0,0])
data['answer'].append([1,0,0,0,1,0,0,1,0,0])
data['answer'].append([1,0,0,1,0,0,1,0,0,0])
data['answer'].append([1,1,0,1,0,1,1,0,0,0])
data['answer'].append([1,0,0,1,1,0,1,1,1,1])
data['answer'].append([1,0,0,1,0,0,0,0,0,0])

json.dump(data,open(stage+'.json','w'),sort_keys=True)
